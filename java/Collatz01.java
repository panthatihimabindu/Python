public class Collatz01 {
    public static void main(String[] args) {
        System.out.println(getCollatzSequence(1));
    }

    public static String getCollatzSequence(int number) {
    	
	    if(number <= 0)
	    	return "Error";
	   
	    String collatzSequence = "";
	    
	    while(number >= 1)
	    {
	    	if(number %2 == 0)
	    		number = number/2;
	    	
	    	else
	    		number = (3 * number + 1);
	    	
	    	
	    	collatzSequence = collatzSequence + number + " ";
	    }
	   
	    return collatzSequence.trim();
	}
}





