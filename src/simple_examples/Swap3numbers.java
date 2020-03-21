package simple_examples;

public class Swap3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int x = 2;
		int y = 3;
		int z = 4;
		int a = 0;
		System.out.println("X:"+x+"\tY:"+y+"\tZ:"+z);
		a = x ;
		x = y;
		y = z;
		z = a;
		System.out.println("X:"+x+"\tY:"+y+"\tZ:"+z);
	}

}
