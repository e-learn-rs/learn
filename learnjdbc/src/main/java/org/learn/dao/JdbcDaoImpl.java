package org.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.learn.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl 
{  
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate; 
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public JdbcDaoImpl() throws Exception 
	{
		/* driver = "org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver).newInstance(); 
		conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db"); */
		 
		
	}
	 
	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) 
	{ 
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource); 
	}

	public Circle getCircle(int circleId)  
	{
	    Connection conn = null;
		try
		{ 
		 conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from circle where id = ?");
		ps.setInt(1, circleId);  
		
		Circle circle = null;
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			circle = new Circle(circleId , rs.getString("name")); 
		}
		rs.close();
		ps.close();
		return circle;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			try
			{
				conn.close();
			} 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public int getCountOfCircleRecords()
	{
		String query = "select * from circle";  
		return jdbcTemplate.queryForList(query).size(); 
	}
	
	public String getNameOfCircleFromIdUsingJdbcTemplate(int circleId)
	{
		String query = "select name from circle where id = ?" ;  
		String name = jdbcTemplate.queryForObject(query, new Object[]{circleId} , String.class);  
		return name;  
	}
	
	public Circle getCircleFromIdUsingJdbcTemplte(int circleId)
	{
		String sql = "SELECT * FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{circleId}, new CircleMapper());  
	}
	
	public List<Circle> getAllCircles()
	{ 
		String sql = "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	public void insertCircle(Circle circle)
	{
		String sql = "INSERT INTO CIRCLE (ID,NAME) VALUES (?,?)";
	 	jdbcTemplate.update(sql, new Object[]{circle.getId() ,  circle.getName()});  
	} 
	
	public void insertCircleUsingNamedParameterJdbcTemplate(Circle circle)
	{
		String sql = "INSERT INTO CIRCLE (ID,NAME) VALUES (:id,:name)";
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", circle.getId()).addValue("name", circle.getName()); 
		namedParameterJdbcTemplate.update(sql, namedParameters); 
		
	}
	
	public void createTriangleTable()
	{
		String sql ="CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(50))";  
		jdbcTemplate.execute(sql); 
	} 
	
	
	private static class CircleMapper implements RowMapper<Circle>
	{  
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException
		{ 
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));  
			circle.setName(resultSet.getString("NAME"));  
			return circle;
		}   
	}
	
	
	
	

}
