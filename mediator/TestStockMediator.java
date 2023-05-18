package mediator;
public class TestStockMediator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             

		StockMediator nyse = new StockMediator();

		GoormanSlacks broker = new GoormanSlacks(nyse);

		JTPoorMan broker2 = new JTPoorMan(nyse);

		///write code to sale and get offer through mediator
               
              nyse.getstockOfferings();
              broker.buyOffer("CD", 1000);
              broker2.buyOffer("ABC", 1000);
              
              broker.saleOffer("ABC", 99);
              broker2.saleOffer("CD", 99);
              nyse.getstockOfferings();
                

	}

}

