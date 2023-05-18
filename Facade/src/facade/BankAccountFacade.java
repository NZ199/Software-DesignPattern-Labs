package facade;
public class BankAccountFacade {


	private int accountNumber;
	private int securityCode;


        AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
        
	public BankAccountFacade(int newAcctNum, int newSecCode)
        {
          	accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();

	}

	public int getAccountNumber() { return accountNumber; }

	public int getSecurityCode() { return securityCode; }


	public void withdrawCash(double cashToGet){

		//check if account number is valid, account has available fund and security code is
		// correct, allow user to withdraw money and type "transaction complete" 
		// if not, type "transaction failed"
    	if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) &&
	   fundChecker.haveEnoughMoney(cashToGet)) 
           { 
             System.out.println("transaction complete\n");
					
	    }
        else {
	     System.out.println("transaction failed\n");
             }

	
		

	}


	public void depositCash(double cashToDeposit)
        {

		//check if account number is correct and security code is correct, then allow user to
		// deposit money and type "transaction complete"
		// if not, type "transaction is not complete"
		if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()))
                {
                    fundChecker.makeDeposit(cashToDeposit);
                    System.out.println("transaction complete\n");
                } 
                else 
                {
		System.out.println("transaction is not complete\n");
					
		}
		
        }
}

