package Example.factoryDesignPatternCurrency;

public class CurrencyDetails 
{
	
	public static void showDetails(String country ,Currency currency)
	{
		System.out.println("Name of currency of [ "+country+" ] is [ "+currency.getName()+" ] and symbol is [ "+currency.getSymbol()+" ] ");  
	}
	
	
	
	public static void main(String args[])
	{
		CurrencyFactory factory = new CurrencyFactory();
		String country = "US"; 
		factory.setCountry(country);  
		Currency currency = factory.getCurrency();
		showDetails(country, currency);
		
	}

}
