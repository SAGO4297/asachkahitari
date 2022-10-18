
package Bank;

public class Banker{
	public static Loan Personal(){
		var loan = new PersonalLoan();
		return loan;
	}

	public static Loan Home(){
		var loan = new HomeLoan();
		return loan;
	}

	private Banker () {}
}
