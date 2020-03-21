package simple_examples;

public class Swap3without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int x = 2;
		int y = 3;
		int z = 4;
		System.out.println("X:"+x+"\tY:"+y+"\tZ:"+z);
		x = x+y+z;//2+3+4=9
		y = x-(y+z);//9-(3+4)=2
		z= x-(y+z);//9-(2+4) = 3
		x= x-(y+z);//9-(2+3)=4
		System.out.println("X:"+x+"\tY:"+y+"\tZ:"+z);
		
	}

}
