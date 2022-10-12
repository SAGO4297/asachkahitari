package hospital;
class Patient{
	private static int pid;
	private static int bedType;
	private static int days;

	public Patient(){
		pid = 1002;
		bedType = 1;
		days = 10;
	}

	public Patient(int id, int type, int numdays){
		pid = id;
		bedType = type;
		days = numdays;
	}

	public int getpid(){
		return pid;
	}

	public void setpid(int id){
		pid = id;
	}
	
	public int getbedType(){
		return bedType;
	}

	public void setbedType(int type){
		bedType =  type;
	}

	public int getdays(){
		return days;
	}

	public void getdays(int numdays){
		days = numdays;
	}
	
	public double getPricePerDay(){
		double rate = 0 ;
		if(bedType == 1)
			rate = 500;
		if(bedType == 2)
			rate = 350;
		if(bedType == 3)
			rate = 200;
		return rate;
	}

	public double getBillAmount(){
		return getPricePerDay() * days;
	}
}
