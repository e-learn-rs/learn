package Example.factoryDesignPatternCurrency;

public class USCurrency implements Currency 
{ 
	
	@Override
	public String getName()
	{
		return "USDollar";
	}
	
	@Override
	public String getSymbol()
	{
		return "USD"; 
	}

}
