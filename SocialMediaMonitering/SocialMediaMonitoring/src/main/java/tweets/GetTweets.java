package tweets;
import java.util.List;
import sentimentalAnalysis.DriverClass;
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
	DriverClass driver = new DriverClass();
	QueryResult result;
	 public List<Status> getTweetMention()
	   {
		   ConfigurationBuilder cb = new ConfigurationBuilder();
		   cb.setDebugEnabled(true)
		   .setOAuthConsumerKey("wa")
		   .setOAuthAccessToken("732RyKujy")
		   .setOAuthAccessTokenSecret("krzX");
	 Twitter twitter = new TwitterFactory(cb.build()).getInstance();
	 try 
	 {
	     Query query = new Query("@Muruges");
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
