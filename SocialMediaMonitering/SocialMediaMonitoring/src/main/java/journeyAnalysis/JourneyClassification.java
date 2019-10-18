package journeyAnalysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JourneyClassification
{
   public String journeyAnalysis(String userTweet)
   {
	   List<String> homeservice = new ArrayList<String>();
	   List<String> payment=new ArrayList<String>();
	   List<String> smartmeter=new ArrayList<String>();
	   List<String> installation=new ArrayList<String>();
	   HashMap<String,Integer>map=new HashMap<String, Integer>();
	   String result = null;
	   int homeservicecount=0;
       int paymentcount=0;
       int smartmetercount=0;
       int installationcount=0;
       homeservice.add("boilers");
       homeservice.add("boiler");
       homeservice.add("Boiler");
       homeservice.add("replace");
       payment.add("credit");
       payment.add("credited");
       payment.add("transaction");
       payment.add("bank");
       payment.add("payments");
       payment.add("balance");
       payment.add("add");
       payment.add("money");
       payment.add("debit");
       payment.add("debited");
       payment.add("owes");
       payment.add("cut off");
       smartmeter.add("readings");
       smartmeter.add("smartmeter");
       smartmeter.add("readings,");
       smartmeter.add("unit");
       smartmeter.add("meter");
       installation.add("fit");
       installation.add("install");
       String tweets[] = userTweet.split(" ");
       int length = tweets.length;
       for(int ind = 0; ind < length; ind++)
       {
         if(homeservice.contains(tweets[ind]))
         {
             homeservicecount++;
         }
         else if(installation.contains(tweets[ind]))
         {
             installationcount++;
         }
         else if(payment.contains(tweets[ind]))
         {
             paymentcount++;
         }
         else if(smartmeter.contains(tweets[ind]))
         {
             smartmetercount++;
         }
       }
       map.put("homeservice",homeservicecount);
       map.put("installation",installationcount);
       map.put("payment",paymentcount);
       map.put("smartmeter",smartmetercount);
       int maxValueInMap=(Collections.max(map.values()));  
      for(Map.Entry<String, Integer> entry : map.entrySet()) { 
           if (entry.getValue()==maxValueInMap) {
               result = entry.getKey();     
           }
       }
	   
	   return result;
   }
}
