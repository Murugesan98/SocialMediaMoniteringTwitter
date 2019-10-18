package sentimentalAnalysis;

public class DriverClass
{
	public String sentiment(String text)
	{
	SentimentalAnalysis sentimentAnalysis = new SentimentalAnalysis();
	sentimentAnalysis.initialize();
	SentimentResult sentimentResult = sentimentAnalysis.getSentimentResult(text);
	String result = sentimentResult.getSentimentType();
	return result;
    }
}