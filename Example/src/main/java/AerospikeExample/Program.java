package AerospikeExample;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;

public class Program 
{
	
	private AerospikeClient client;
	private String seedHost;
	private int port;
	private String namespace;
	private String set;
	
	public Program(String seedHost, int port , String nameSpace , String set )
	{ 
		this.seedHost = seedHost;
		this.port = port;
		this.namespace = nameSpace ; 
		this.set = set; 
		ClientPolicy cPolicy = new ClientPolicy();
		cPolicy.timeout = 500;
		client = new AerospikeClient(cPolicy, this.seedHost , this.port);  
	}
	
	public void workOnAerospike()
	{
		if(null == client || !client.isConnected())  
		{
			System.out.println("Client is not connected.. ");  
		} 
		else
		{
			System.out.println("Client is connected.. ");  
		}
		UserService us = new UserService(client);
		String username = "Robin Singh"; 
		//us.createUser(username, "Navi", "male", "cricket,football,cycling"); 
		us.printUserDetails(username);
		TweetService ts = new TweetService(client);
		ts.scanAllTweets();
		ts.createTweet(username, "I am enjoying cricket"); 
		us.printUserDetails(username); 
		us.printUserTweets(username);  
		client.close();
	}
	
	public static void main(String args[])
	{
		String hostname = "127.0.0.1";
		int port = 3000;
		String namespace = "test";
		String set = "demo";
		Program program = new Program(hostname, port, namespace, set); 
		program.workOnAerospike();
		
	}

}
