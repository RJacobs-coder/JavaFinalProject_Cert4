
package defaultPackage;
import myLoan.*;
import java.util.*;
import java.io.*;


public class CreateLoans implements LoanConstants {
    
    /**
     * Default Constructor.
     */
    public CreateLoans(){
        
    }
    
    /**
     * Creates Loans from other classes and allows the user to input values.
     */
    public void loanCreate(){
        
    ArrayList<Loan> loans = new ArrayList<Loan>();
    
    int l = 5;
    int MAX = maxLoan;
    double primeInterestRate;
    Loan[] loanArray = new Loan[l];
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Please enter the prime Interest Rate - ");
    primeInterestRate = userInput.nextDouble();
    userInput.nextLine();
    
    for (int i = 0; i < l; i++)
    {
        System.out.println("Please enter the line type you want - Personal == 1, Buisness == 2, Input Other keys to cancel.");
        int loanSwitch = userInput.nextInt();
        
        // Loan Number, Name, Amount, Term, Prime Interest.
        switch(loanSwitch){
            case 1: System.out.println("You have selected Personal Loan, Please enter the Loan ID Number - ");
                    int loanIDPer = userInput.nextInt();
                    System.out.println("Please enter the Account Name - ");
                    String namePer = userInput.next();
                    System.out.println("Please enter Loan Amount - ");
                    double borrowedAmountPer = userInput.nextDouble();
                        if(borrowedAmountPer < MAX)
                    {
                    }
                        else{
                        System.out.println("Loan amount too high, please enter a number below - " + MAX);
                        borrowedAmountPer = 0;
                        return;
                    }
                    System.out.println("What is the loan Term? - Short == 1 year, Med == 3 years, Long == 5 years.");
                    int termPer = userInput.nextInt();
                    
                   // public PersonalLoan (String companyName, int loanNumber, int loanTerm, int primeRate, double loanAmount)
                    loanArray[i] = new PersonalLoan(namePer, loanIDPer, termPer, primeInterestRate, borrowedAmountPer);
                    loans.add(loanArray[i]);
                    break;
                   
                   
                
            case 2:
                    System.out.println("You have selected Business Loan, Please enter the Loan ID Number - ");
                    int loanIDBus = userInput.nextInt();
                    System.out.println("Please enter the Account Name - ");
                    String nameBus = userInput.next();
                    System.out.println("Please enter Loan Amount - ");
                    double borrowedAmountBus = userInput.nextDouble();
                        if(borrowedAmountBus < MAX)
                    {
                   
                    }
                        else{
                        System.out.println("Loan amount too high, please enter a number below - " + MAX);
                        borrowedAmountBus = 0;
                        return;
                    }
                    System.out.println("What is the loan Term? - Short == 1 year, Med == 3 years, Long == 5 years.");
                    int termBus = userInput.nextInt();
                    
                   // public BuisnessLoan (String companyName, int loanNumber, int loanTerm, int primeRate, double loanAmount)
                    loanArray[i] = new PersonalLoan(nameBus, loanIDBus, termBus, primeInterestRate, borrowedAmountBus);
                    loans.add(loanArray[i]);
                    break;
                
            default:
                System.out.println("Invalid Input. Please Try again.");
                break;
        }
    }
     try {
            FileOutputStream fileOut = new FileOutputStream("loans.bin");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(loans);
            fileOut.close();
            System.out.println("File Created - loans.bin");
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
        for (Loan loanLoop : loans) {
            System.out.println(loanLoop.toString());
        }
    
    }
    
    
    
}
