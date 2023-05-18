package mediator;
public class Collegue {

	private Mediator mediator;
	private int colleagueCode;


	public Collegue(Mediator newMediator){
		
		mediator = newMediator;
		mediator.addColleague(this);

	}

	public void saleOffer(String stock, int shares){
            mediator.saleOffer(stock, shares, colleagueCode);

	}

	public void buyOffer(String stock, int shares){

		mediator.buyOffer(stock, shares, colleagueCode);

	}

	public void setCollCode(int collCode){ 
            colleagueCode = collCode; 
        }


}

