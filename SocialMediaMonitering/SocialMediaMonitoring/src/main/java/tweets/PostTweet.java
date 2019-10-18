package tweets;

import journeyAnalysis.JourneyLink;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class PostTweet
{
	public void postTweet(Long tweetid, String name, String journey,String result) throws TwitterException
	{
		    ConfigurationBuilder cb = new ConfigurationBuilder();
		    cb.setDebugEnabled(true)
		    .setOAuthConsumerKey("wadldYLHBG8UsJZLpa31Uw")
		    .setOAuthConsumerSecret("KOzAq53VF8bQ34OkRzDz3YhytnveQurpz4UCESgjddU6CN94")
		    .setOAuthAccessToken("732546452187021312-3nmkB9Uzryqyl5RyKujyfNPJTF81u")
		    .setOAuthAccessTokenSecret("kIaqRlGdgypDm10DDQegbWYpvb7ZwL2CFSXlxr8OzXJ");
		    Twitter twitter = new TwitterFactory(cb.build()).getInstance();
		    JourneyLink attachment = new JourneyLink(); 
		    if(result.equals("Positive"))
		    {
		    String text = "Hi" + "@" + name + " It's always a pleasure seeing you. Thanks so much for your positive and good vibes. You've always taken the time to share your experience with us. We're happy that you're happy, and we're looking forward to have a stability in connecting with you. ";
		    StatusUpdate stat= new StatusUpdate(text);
            stat.setInReplyToStatusId(tweetid);
		    twitter.updateStatus(stat);
		    }
		    else if(result.equals("Negative"))
		    {
		    	 String link = attachment.solution(journey);
		    	 String text = "Hi" + "@" + name + " Thanks so much for sharing your experience with us. We're so sorry that your experience with us fell short of expectations. Please raise your complaint in this below link. Our customer service team will investigate on it " + link;
		    	 StatusUpdate stat= new StatusUpdate(text);
		         stat.setInReplyToStatusId(tweetid);
				 twitter.updateStatus(stat);
		    }
		    else
		    {
		    	    String text = "Hi" + "@" + name + " Thanks so much for sharing your experience with us. We want you to feel comfortable sharing good or bad news with us. I'm so sorry that your experience with us fell short of expectations. I also want to thank you for giving us a chance to make things right.We're using your feedback to make some important changes in our service.";
				    StatusUpdate stat= new StatusUpdate(text);
		            stat.setInReplyToStatusId(tweetid);
				    twitter.updateStatus(stat);
		    }
	}

}
