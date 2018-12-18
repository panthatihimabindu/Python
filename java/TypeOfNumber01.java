public class TypeOfNumber01 {
    public static void main(String[] args) {
        int num = 28;
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println("Perfect Number");
        else if (res == 1) 
            System.out.println("Abundant Number");
        else if (res == -1)
            System.out.println("Deficient Number");
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
    	
    			if(num < 0)
    				return -2;
    			if(num == 0)
    				return -3;
    	
    			int sumOfFactors = 0;
    			for(int i =1; i < num; i++)
    			{
    				if(num % i == 0)
    					sumOfFactors = sumOfFactors + i;
    			}
    			if(sumOfFactors == num) return 0;
    			
    			else if(sumOfFactors > num) return 1;
    			
    			else return -1;
    			
        
    }
}

