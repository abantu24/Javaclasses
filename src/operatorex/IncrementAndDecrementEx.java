package operatorex;

public class IncrementAndDecrementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a = 10;
  int b = 20;
  int c= 30;
  
  if((a<b) && (a++>c))
	  
	  System.out.println("passed the logical && statement");
  
  if((a<b)||(a++>c))
	  
	  System.out.println("passed the logical || statement");
  
	}

}
