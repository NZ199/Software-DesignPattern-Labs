package facade;
public class TestBankFacade {

	public static void main(String[] args){

		//type code to withdraw money and delete money using the facade class
                BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		
		accessingBank.withdrawCash(30.00);
		
		accessingBank.withdrawCash(990.00);
		

	}

}

