package factoryDesignPatternCurrency;

public class ChineseCurrency implements Currency
{
	@Override
	public String getName()
	{
		return "Yuan";
	}
	
	@Override
	public String getSymbol()
	{
		return "CNY"; 
	}
}
