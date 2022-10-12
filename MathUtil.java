class MathUtil{
	private static int num;

	public static boolean isEven(){
		if(num % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(){
		if(num % 2 != 0)
			return true;
		return false;
	}

	public static boolean isPrime(){
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num == 3)
			return true;
		if (isEven())
			return false;
		if (isOdd())
			for(int i = 3; i * i<= num ;i += 2)
			{
				if(num % i == 0)
					return false;
			}
			return true;
	}
/*
	public static int countPrimes(){
		int term , count=0;
		for(term=1;count<=num;count++)
		{
			boolean i;
			i = isPrime();
			int a = Integer.parseInt(i);
			int sum = sum + a;
			return sum;
		}
	}
*/
	public static int reverse(){
		int i, sum = 0;
		do
		{
			i = num % 10;
			sum =sum*10 + i;
			i = num/10;
		}while(i>0);
	return sum;
	}

	public static int digitsCount(){
		int a,b,c;
		a = 1;
		b = num;
		c = 0;
		do
		{
			a = a * 10;
			c = c + 1;
		}
		while(a<=b);
		return c;
	}


/*
	public void reverseNumber()
		{
			int temp = number;
			int sum  = 0;
			int count= 0;
		do{
			sum  =  sum *10 + temp % 10;
			temp =  temp / 10;
			count +=1;
		  }
		while(temp>0);
		         System.out.ptintf("The reverse of number %d is: %d%n", number,sum);
		         System.out.printf("Total digit Number is: );
	        }	 
*/

}
