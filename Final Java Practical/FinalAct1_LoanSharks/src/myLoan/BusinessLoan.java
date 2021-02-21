
package myLoan;
import java.io.Serializable;
public class BusinessLoan extends Loan implements Serializable {
    
    /**
     * Business Loan Constructor - Sub Class of Loan Class.
     * @param companyName
     * @param loanNumber
     * @param loanTerm
     * @param primeRate
     * @param loanAmount 
     */
    public BusinessLoan (String companyName, int loanNumber, int loanTerm, double primeRate, double loanAmount){
        
        super.setLoanType("Business");
        super.setCustomerName(companyName);
        super.setLoanNumber(loanNumber);
        super.setLoanTerm(loanTerm);
        super.setGeneralRate(generalRate);
        super.generalRate = primeRate + 1;
        super.maxTotal = (getGeneralRate() / 100) * (getLoanAmount() * 2);
        
    }
}
