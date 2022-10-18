package Bank;

final class PersonalLoan extends Loan implements Taxation{

	public double GetRate(){
		double rate = 0;

		if(principle<=500000){	
	    		return rate = 15;
      		}
         	else
			return rate = 16;
	}
	public double Tax(){
		double p = principle;
		return p > 2000000 ? 0.9 * p : p ;
	}
}
