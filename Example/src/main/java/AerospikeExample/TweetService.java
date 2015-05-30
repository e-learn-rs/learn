package AerospikeExample;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
import com.aerospike.client.Record;
import com.aerospike.client.ScanCallback;
import com.aerospike.client.policy.Priority;
import com.aerospike.client.policy.RecordExistsAction;
import com.aerospike.client.policy.ScanPolicy;
import com.aerospike.client.policy.WritePolicy;

public class TweetService 
{
	private AerospikeClient client;
	
	public TweetService(AerospikeClient client)
	{
		this.client = client;
	}
	
	private void updateUser(WritePolicy writePolicy ,Key userkey , int tweetcount  , long timestamp )
	{
		client.put(writePolicy, userkey, new Bin("tweetcount", tweetcount) , new Bin("lasttweeted", timestamp)); 
	}
	
	public void createTweet(String username , String tweet)
	{
		Key userkey = new Key("test", "users", username);
		Record userRecord = client.get(null, userkey); 
		int nextTweetCount = Integer.parseInt(userRecord.getValue("tweetcount").toString()) + 1 ;   
		
		WritePolicy writePolicy = new WritePolicy();
		writePolicy.recordExistsAction = RecordExistsAction.UPDATE; 
		
		long timestamp = System.currentTimeMillis();  
		
		Key tweetKey = new Key("test", "tweets", username + ":" +nextTweetCount);
		Bin bin1 =  new Bin("tweet", tweet);
		Bin bin2 = new Bin("timestamp", timestamp);
		Bin bin3 = new Bin("username", username); 
		client.add(writePolicy, tweetKey, bin1 , bin2 , bin3); 
		
		updateUser(writePolicy , userkey , nextTweetCount , timestamp);
		System.out.println("\n TWEET SAVED..");
		
	}
	
	public void scanAllTweets()
	{
		ScanPolicy scanPolicy = new ScanPolicy();
		scanPolicy.concurrentNodes = true;
		scanPolicy.priority = Priority.LOW;
		scanPolicy.includeBinData = true;
		
		client.scanAll(scanPolicy, "test", "tweets", new ScanCallback() {

            @Override
            public void scanCallback(Key key, Record record)throws AerospikeException 
            {
            	System.out.println(record.getValue("tweet") + "\n");

            } 
        }, "tweet");
		
		client.scanAll(scanPolicy, "test" , "tweets" , new ScanCallback() 
		{
			@Override
			public void scanCallback(Key key, Record record) throws AerospikeException 
			{ 
				// TODO Auto-generated method stub 
				
				System.out.println("Tweet from user [ "+record.getValue("username")+" ] is [ "+record.getValue("tweet")+" ] ");   
			}
		},"tweet","username"); 
	}
	
	

}
