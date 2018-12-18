public class Armstrong01 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 2000;
        System.out.println(generateArmstrongNums(num1, num2));
       

    }
    
    public static String generateArmstrongNums(int start, int limit) {
   	
    	
    	String armstrongNums = "";

    	if(start <= 0 || limit <= 0)
    		return "-1";
    	else if( start >= limit)
    		return "-2";
    	else
    	for(int i = start; i <= limit; i++)
    		if(isArmstrong(i))
    			armstrongNums = armstrongNums + "," + i;
    	if(armstrongNums.length() == 0)
    		return "-3";
    	return armstrongNums.substring(1);
    	
    }

    public static boolean isArmstrong(int num) {
		 
    	if(num == sumOfPowersOfDigits(num))
    		return true;
    	else
    		return false;
      
    }

    public static int sumOfPowersOfDigits(int n) {
    	
    	int sum = 0;
    	int digitsArray[] = getDigits(n);
    	for(int i = 0; i < digitsArray.length ;i++ )
    	sum = sum + power(digitsArray[i], digitsArray.length);	
		return sum;
        
    }

    public static int[] getDigits(int n) {
     
        int len = Integer.toString(n).length();
        int[] digitArray = new int[len];
        for (int index = 0; index < len; index++) {
        	digitArray[index] = n % 10;
            n /= 10;
        } return digitArray;
        
    }

    public static int power(int d, int p) {
/*    	return (int)Math.pow(d, p);*/
    	int res = 1;
    	for(int i = 0; i < p; i++ )
    		res = res * d;
    	return res;
		
    }
}
