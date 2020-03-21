package simple_examples;

public class Swapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int A = 10;
      int B = 20;
      int C = 0;
      System.out.println("A and B values before swapping:");
      System.out.println("A:" +A);
      System.out.println("B:"+B);
      C= A;
      A=B;
      B=C;
      
    System.out.println("A and B values after swapping:");  
    System.out.println("A:" +A);
    System.out.println("B:"+B);
	}

}
