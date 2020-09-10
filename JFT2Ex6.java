//Written by: Jessica Rangel
//Date: 10/09/2020
//Purpose: Hello Universe

public class JFT2Ex6
{
	public static void main(String[] args)
	{
		double eur_gbp = 0.697443;
		double eur_usd = 1.08901;
		double eur_jpy = 135.090;
		double heur_gbp = (100 * eur_gbp);
		double heur_usd = (100 * eur_usd);
		double heur_jpy = (100 * eur_jpy);
		
		System.out.println("Welcome to the FX Currency Converter.");
		System.out.println("Currency Conversion Rates:");
		System.out.println("Euro 100 will buy " + heur_gbp + " British Pound");
		System.out.println("Euro 100 will buy " + heur_usd + " American Dollars");
		System.out.println("Euro 100 will buy " + heur_jpy + " Japanese Yen");
	}
}