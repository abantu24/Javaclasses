package simple_examples;

public class Swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int A = 10;
	    int B = 20;
	    System.out.println("A and B values before swapping:");
	      System.out.println("A:" +A);
	      System.out.println("B:"+B);
	    A= A+B;//30
	    B=A-B;//30-20=10
	    A=A-B;//30-10=20;
	    
	    System.out.println("A and B values after swapping:");  
	    System.out.println("A:" +A);
	    System.out.println("B:"+B);
	    
	}

}
