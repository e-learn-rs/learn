package factoryDesignPatternCurrency;

public class CurrencyFactory 
{
	
	private String country;
	
	
	public void setCountry(String country)
	{
		this.country = country ; 
	}
	
	public Currency getCurrency()
	{
		if(country.equalsIgnoreCase("INDIA"))
			return new IndianCurrency();
		
		else if(country.equalsIgnoreCase("US"))
			return new USCurrency(); 
		
		else if(country.equalsIgnoreCase("CHINA"))
			return new ChineseCurrency(); 
		
		return null;
	}

}
