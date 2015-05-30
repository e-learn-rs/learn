package AerospikeExample;

import java.util.Arrays;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.Record;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.RecordExistsAction;
import com.aerospike.client.policy.WritePolicy;

public class UserService
{
	private AerospikeClient client;
	
	public UserService(AerospikeClient client)
	{
		this.client = client;
	}
	
	public void createUser(String username , String password , String gender , String interests)
	{
		WritePolicy writePolicy = new WritePolicy();
		writePolicy.recordExistsAction = RecordExistsAction.UPDATE;
		Key key = new Key("test", "users", username); 
		Bin bin1 = new Bin("username", username); 
		Bin bin2 = new Bin("password", password); 
		Bin bin3 = new Bin("gender", gender); 
		Bin bin4 = new Bin("lasttweeted", 0);
		Bin bin5 = new Bin("tweetcount", 0);
		Bin bin6 = Bin.asList("interests" , Arrays.asList(interests.split(","))); 
		client.put(writePolicy, key, bin1 , bin2 , bin3, bin4, bin5 ,bin6); 
		System.out.println("NEW USER CREATED... \n ");
	}
	
	public void printUserDetails(String username)
	{
		System.out.println("\nUSER DETAILS ...");
		Key userKey = new Key("test", "users", username);
		Record userRecord = client.get(null, userKey); 
		System.out.println("User name :: "+userRecord.getValue("username"));  
		System.out.println("Password :: "+userRecord.getValue("password"));
		System.out.println("gender :: "+userRecord.getValue("gender"));
		System.out.println("tweetcount :: "+userRecord.getValue("tweetcount")); 
		System.out.println("interests :: "+userRecord.getValue("interests"));
   	}
	
	public void printUserTweets(String username)
	{
		Key userkey = getUserKey(username);
		Record userRecord = client.get(null, userkey);
		int tweetcount = Integer.parseInt(userRecord.getValue("tweetcount").toString()); 
		System.out.println("tweet count :: "+tweetcount) ; 
		Key[] usertweetkeys = new Key[tweetcount]; 
		for(int i = 0 ; i < tweetcount ; i++)
		{
			usertweetkeys[i] = new Key("test", "tweets", username +":"+ (i+1)); 
		}
		
		Record[] records = client.get(null, usertweetkeys);
		System.out.println("\nuser tweets are ::\n");
		for(int i = 0 ; i < records.length ; i++)
		{
			System.out.println(records[i].getValue("tweet"));  
		}
		
		
	}
	
	private Key getUserKey(String username)
	{
		return new Key("test", "users", username);
	}

}
