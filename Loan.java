package Bank;

abstract class Loan 
{

	double principle;
	float period;

	public Loan (double p , float n){
		principle = p;
		period = n;
	}

	public Loan(){
		principle= 10000;
		period = 3;
	}

	public double Getprinciple(){
		return principle;
	}

	public void Setprinciple( double p){
		principle = p;

	}

	public double Getperiod(){
		return period;
	}

	public void Setperiod(float n){
		period = n;
	}

	public abstract double GetRate();



	public double getEMI(){
	  	double r = GetRate();
		double EMI = Getprinciple() * (1 + r * Getperiod()/100)/ (12 * Getperiod());
		return EMI;
     	 }


}



