
package myLoan;
import java.io.Serializable;


public class Loan implements LoanConstants, Serializable {

    /**
     * @return the loanNumber
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * @param loanNumber the loanNumber to set
     */
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    /**
     * @return the primeRate
     */
    public double getPrimeRate() {
        return primeRate;
    }

    /**
     * @param primeRate the primeRate to set
     */
    public void setPrimeRate(int primeRate) {
        this.primeRate = primeRate;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the businessRate
     */
    public double getBusinessRate() {
        return businessRate;
    }

    /**
     * @param businessRate the businessRate to set
     */
    public void setBusinessRate(double businessRate) {
        this.businessRate = businessRate;
    }

    /**
     * @return the personalRate
     */
    public double getPersonalRate() {
        return personalRate;
    }

    /**
     * @param personalRate the personalRate to set
     */
    public void setPersonalRate(double personalRate) {
        this.personalRate = personalRate;
    }

    /**
     * @return the generalRate
     */
    public double getGeneralRate() {
        return generalRate;
    }

    /**
     * @param generalRate the generalRate to set
     */
    public void setGeneralRate(double generalRate) {
        this.generalRate = generalRate;
    }

    /**
     * @return the maxTotal
     */
    public double getMaxTotal() {
        return maxTotal;
    }

    /**
     * @param maxTotal the maxTotal to set
     */
    public void setMaxTotal(double maxTotal) {
        this.maxTotal = maxTotal;
    }

    /**
     * @return the loanTerm
     */
    public double getLoanTerm() {
        return loanTerm;
    }

    protected int loanNumber;
    protected String customerName, loanType;
    protected double loanAmount, businessRate, personalRate, generalRate, primeRate, maxTotal, loanTerm;
    private int loanYear = 1;
    
    
    /**
     * Overrides toString Method with a custom version that allows the easy printing of specific String.
     * @return 
     */
    @Override
    public String toString() {
        String customString;

        customString = "Loan Number = " + getLoanNumber() + "Loan Type = " + getLoanType() + " Loan Amount = " +  getLoanAmount()
                + " Loan Term = " + getLoanTerm() + "Company Name = " + companyName + " Customer Name = " + getCustomerName() + " Interest Rate = "
                + getGeneralRate() + " Total Amount + Interest" + getMaxTotal();

        return customString;
    }
    
    // Default Constructor
    /**
     * Default Constructor for Loan Class.
     */
    public Loan(){
        
    }  
    /**
     * Loan Constructor that allows the Loan class to be called elsewhere.
     * @param customerName
     * @param loanAmount
     * @param loanTerm
     * @param primeRate
     * @param loanNumber 
     */
    public Loan(String customerName, double loanAmount, int loanTerm, int primeRate, int loanNumber) {
        
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.primeRate = primeRate;
        this.loanNumber = loanNumber;
    }
    
    /**
     * Sets the loan term of Long, medium or short term loans.
     * @param loanTerm 
     */
    public void setLoanTerm(double loanTerm){
        
        if(loanTerm == loanYear * 5){
            loanTerm = longTerm;
        }
        else if(loanTerm == loanYear * 3){
            loanTerm = medTerm;
        }
        else{
            loanTerm = shortTerm;
        }
        this.loanTerm = loanTerm;
        
    }
}
    
    