package hospital;

class InHousePatient extends Patient{
	private double discount;

	public InHousePatient(){
		super(1002,1,10);
		discount = 0.05;
	}

	public InHousePatient(int id, int type, int numdays,double dis){
		super(id,type,numdays);
		discount = dis;
	}

	public static double getBillAmount(){
		
