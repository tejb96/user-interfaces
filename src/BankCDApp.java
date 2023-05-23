/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 *  
 * @author Tejpreet Bal
 *
 */
import java.text.NumberFormat;

public class BankCDApp {
	
	private BankCD bank;
	private InteractiveCLI cli;
	private NumberFormat currencyFormat;
    private NumberFormat percentFormat;
	
	public BankCDApp() {
		
		cli = new InteractiveCLI();
		currencyFormat = NumberFormat.getCurrencyInstance();
        percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMaximumFractionDigits(2);
	}
	
	public void run() {
		//TODO: add code here
		cli.display("************************ OUTPUT ********************");
		cli.display("Compare daily and annual compounding for a Bank CD.");

        cli.prompt("Input CD initial principal, e.g. 1000.55 > ");
        double principal = cli.getKeyboardDouble();

        cli.prompt("Input CD interest rate, e.g. 6.5 > ");
        double rate = cli.getKeyboardDouble()/100;

        cli.prompt("Input the number of years to maturity, e.g., 10.5 > ");
        double years = cli.getKeyboardDouble();

        BankCD bankCD = new BankCD(principal, rate, years);

        cli.display("For Principal = " + currencyFormat.format(principal) +
                " Rate= " + percentFormat.format(rate) +
                " Years= " + years);

        double yearlyCompound = bankCD.calcYearly();
        double dailyCompound = bankCD.calcDaily();

        cli.display("The maturity value compounded yearly is " +
                currencyFormat.format(yearlyCompound));

        cli.display("The maturity value compounded daily is: " +
                currencyFormat.format(dailyCompound));
        cli.display("************************ OUTPUT ********************");
	}

	public static void main(String[] args) {
		
		BankCDApp app = new BankCDApp();
		app.run();
		

	}

}
