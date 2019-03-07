package Bala.Demo;

public class Transaction {

	private String sourceName;
	private String destinationName;
	private Long sum;
	
	public String getSourceName()
	{
		return sourceName;
	}
	public void setSourceName(String sourceName)
	{
		this.sourceName=sourceName;
	}
	
	public String getdestinationName()
	{
		return destinationName;
	}
	public void setdestinationName(String destinationName)
	{
		this.destinationName=destinationName;
	}
	
	public Long getsum()
	{
		return sum;
	}
	public void setsum(Long sum)
	{
		this.sum=sum;
	}
	
	
}
