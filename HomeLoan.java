package Bank;

public class HomeLoan extends Loan implements Discountable{
		
	public double GetRate(){

		double rate = 0;
		if(principle <= 2000000)
		 {
			return rate = 15;
		 }
		else
			return rate = 16;
	}

	public double Discount (){
		double p = principle;
		return p > 500000 ? getEMI() * 0.95 : getEMI(); 
	}
}
