import java.util.*;

public class SumUntilX {

	public static void main(String args[]) {
		System.out.println("Enter numbers : ");
	    Scanner sc= new Scanner(System.in);
	    int sum= 0;
	    while(true) {	 
	    	String a=sc.next();
	    	if(!a.equals("x"))
	    	sum= sum +Integer.parseInt(a);
	    	
	    	else
	    		break;
	    	
	    }
		System.out.println("Sum of all the entered numbers is : "+ sum);
	}
}
