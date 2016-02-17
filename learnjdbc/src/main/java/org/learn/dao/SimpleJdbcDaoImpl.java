package org.learn.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;


public class SimpleJdbcDaoImpl extends JdbcDaoSupport 
{
	
	public int getCountOfCircleRecords()
	{
		String query = "select * from circle";  
		return getJdbcTemplate().queryForList(query).size();  
	}
	
}
