
public class isStrong {

	public static void main(String[] args) {
		int num = 672;
		System.out.println(isStrong(num));
		
	}
	public static int factorial(int n)
	{
		int res = 1;
		for(int i = n; i > 0; i-- )
			res =  res * i;
		return res;
	}
	public static int sumDigitsFactorial(int n)
	{
		 int sum = 0;
		 while (n > 0)
		 {
			 int rem = n % 10;
			 sum = sum + factorial(rem);
			 n /= 10;
		 }return sum;
	}
	public static boolean isStrong(int n)
	{
		if(sumDigitsFactorial(n) == n)
			return true;
		else
			return false;
	}

}
