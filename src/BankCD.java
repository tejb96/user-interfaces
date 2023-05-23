/**
 * Class representing a certificate of deposit.
 * 
 * @author Tejpreet Bal
 *
 */
public class BankCD {
	private double principal;
    private double rate;
    private double years;
    
    public BankCD(double principal, double rate, double years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }
    
    public double calcYearly() {
        double compoundPrincipal = principal * Math.pow(1 + rate, years);
        return compoundPrincipal;
    }
    
    public double calcDaily() {
        double compoundPrincipal = principal * Math.pow(1 + rate/365, years * 365);
        return compoundPrincipal;
    }
        
}
