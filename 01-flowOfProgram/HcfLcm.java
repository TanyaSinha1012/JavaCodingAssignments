import java.util.*;


public class HcfLcm {
	
	public static int hcf(int a, int b) {
		int temp;
		while(b>0) {
			temp = b;
			b=a%b;
			a=temp;
		}
		
		return a;
	}

	public static void main(String args[]) {
		System.out.println("Enter a 2 numbers : ");
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int resHcf= hcf(n1, n2);
		int resLcm= n1*n2/resHcf;
		
		System.out.println("HCF = "+ resHcf);
		System.out.println("LCM = "+ resLcm);
		
	}
	
	
	
	
	
}
