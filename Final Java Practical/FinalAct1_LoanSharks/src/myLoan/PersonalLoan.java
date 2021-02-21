package myLoan;
import java.io.Serializable;

public class PersonalLoan extends Loan implements Serializable{
    
    /**
     * Personal Loan constructor - Subclass of Loan Class.
     * @param companyName
     * @param loanNumber
     * @param loanTerm
     * @param primeRate
     * @param loanAmount 
     */
    public PersonalLoan (String companyName, int loanNumber, int loanTerm, double primeRate, double loanAmount){
        
        super.setLoanType("Personal");
        super.setCustomerName(companyName);
        super.setLoanNumber(loanNumber);
        super.setLoanTerm(loanTerm);
        super.setGeneralRate(generalRate);
        super.generalRate = primeRate + 2;
        super.maxTotal = (getGeneralRate() / 100) * (getLoanAmount() * 2);
    }
}
