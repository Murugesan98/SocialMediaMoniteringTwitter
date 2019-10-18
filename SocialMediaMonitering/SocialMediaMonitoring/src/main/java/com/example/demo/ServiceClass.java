package com.example.demo;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import journeyAnalysis.JourneyClassification;
import sentimentalAnalysis.DriverClass;
import tweets.GetTweets;
import tweets.PostTweet;
import twitter4j.Status;
import twitter4j.TwitterException;

@Service
public class ServiceClass 
{
     @Autowired 
	 private Jpainterface jpainterface;
	 @PostConstruct
	 public void loadData() throws TwitterException
	  {
		  String result=null;
	      String journey=null;
		  GetTweets tweet = new GetTweets();
		  PostTweet post = new PostTweet();
		  DriverClass driver = new DriverClass();
		  JourneyClassification classification = new JourneyClassification();
		  for(Status status :tweet.getTweetMention())
		  {  
		    
			 Bean bean = new Bean();
			 result = driver.sentiment(status.getText());
			 journey = classification.journeyAnalysis(status.getText());
			 bean.setUser_name(status.getUser().getScreenName());
			 bean.setTweet(status.getText());
			 bean.setResult(result);
			 bean.setJourney(journey);
			 bean.setTweet_id(Long.toString(status.getId()));
			 jpainterface.save(bean); 
		   
	          if(result.equals("Negative"))
	            {
	        	 post.postTweet(status.getId(), status.getUser().getScreenName(),journey,"Negative");
	            }
	          else if(result.equals("Positive"))
	           {
	        	 post.postTweet(status.getId(), status.getUser().getScreenName(),journey,"Positive");
	           }
	         else
	          {
	        	post.postTweet(status.getId(), status.getUser().getScreenName(),journey,"Neutral");
	          }
	        	
		  }
	  }
	  }  

