
public class Ecc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int count=0;
		int digit = 0, i=0;
		int x = number;
		while(x > 0)
		{
			x = x/10;
			count++;

		}System.out.println(count);
		int array[] = new int[count];
			while(number > 0)
			{
				digit = number  % 10;
				array[i++] = digit;
				number = number / 10;
			}
	System.out.println(array);		
	}

}
