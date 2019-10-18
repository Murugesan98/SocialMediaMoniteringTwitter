package centrica.hackathon.smm.twitter;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class GetTweets
{
	PostTweet tweet = new PostTweet();
	centrica.hackathon.smm.sentimentalanalysis.DriverClass driver = new centrica.hackathon.smm.sentimentalanalysis.DriverClass();
	QueryResult result;
	 public List<Status> getTweetMention()
	   {
		   ConfigurationBuilder cb = new ConfigurationBuilder();
		   cb.setDebugEnabled(true)
		   .setOAuthConsumerKey("wadldYLHBG8UsJZLpa31Uw")
		   .setOAuthConsumerSecret("KOzAq53VF8bQ34OkRzDz3YhytnveQurpz4UCESgjddU6CN9")
		   .setOAuthAccessToken("732546452187021312-3nmkB9Uzryqyl5RyKujyfNPJTF81")
		   .setOAuthAccessTokenSecret("kIaqRlGdgypDm10DDQegbWYpvb7ZwL2CFSXlxr8OzX");
	 Twitter twitter = new TwitterFactory(cb.build()).getInstance();
	 try 
	 {
	     Query query = new Query("@Muruges83731078");
	     QueryResult result = twitter.search(query);
	     return result.getTweets();
	 } 
	 catch (TwitterException te) 
	 {
	     te.printStackTrace();
	     System.out.println("Failed to get timeline: " + te.getMessage());
	     System.exit(-1);
	 }
	return result.getTweets();

}
}