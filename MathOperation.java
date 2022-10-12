class MathOperation{
	public static void main(String[] args){

		int number = Integer.parseInt(args[0]);

		System.out.println("Checking for Even or Odd");
		if(MathUtil.isEven())
		{
			System.out.printf("The number %d is even%n",number);
		}
		else
		{	
			System.out.printf("The number %d is odd%n",number);
		}

		System.out.println("Checking for prime");
		
		if(MathUtil.isPrime())
		{
			System.out.printf("The number %d is prime%n",number);
//			System.out.printf("The number of primes upto number %d is %d %n",number,MathUtil.countPrimes());
		}
		else
		{
			System.out.printf("The number %d is not prime%n",number);
		}

		System.out.printf("The reverse order of given number %d is %d %n",number,MathUtil.reverse());
		System.out.printf("The number of digits in the given number %d are %d %n:",number,MathUtil.digitsCount());

	}
}
