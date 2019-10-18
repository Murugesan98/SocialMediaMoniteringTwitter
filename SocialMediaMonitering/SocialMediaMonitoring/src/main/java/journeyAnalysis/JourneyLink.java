package journeyAnalysis;

public class JourneyLink
{
	public String solution(String journey)
	{
		if(journey.equals("homeservice"))
			return "https://www.britishgas.co.uk/complaints.html#_homeservices";
	    else if(journey.equals("payment"))
		   return "https://www.britishgas.co.uk/help-and-support/complaints/pay-as-you-go";
	    else if(journey.equals("smartmeter"))
	    	return "https://www.britishgas.co.uk/help-and-support/complaints/gas-and-electricity";
	    else if(journey.equals("installation"))
	    	return "https://www.britishgas.co.uk/complaints.html#_boilerinstallation";
	   return null;	
	}

}
