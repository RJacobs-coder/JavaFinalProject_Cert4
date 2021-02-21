
package defaultPackage;

/**
 * Name: Robert Jacobs 30018755
 * Date: 28/11/2020
 * Project: Loan Creation Project.
 * Description: Allows a user to create and add values to loan objects. A main loan class is implemented with 2 sub classes (personal and business loans)
 * a Loan Construct interface is implemented to allow the hard coding of specific values to be easily introduced to new Loan objects on creation.
*/
public class FinalAct1_LoanSharks {

    public static void main(String[] args) {
        
        // Calling the CreateLoans Class into the main method.
        CreateLoans main = new CreateLoans();
        
        main.loanCreate();
        
    }
    
}
