package simple_examples;

public class Swap4without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		int c = 4;
		int d = 1;
		
		System.out.println("A:"+a+"\tB:"+b+"\tC:"+c+"\tD:"+d);
		
		a=a+b+c+d;//2+3+4+1 = 10
		b = a-(b+c+d);//10-(3+4+1)=2
		c= a-(b+c+d);//10-(2+4+1)=3
		d=a-(b+c+d);//10-(2+3+1)=4
		a=a-(b+c+d);//10-(2+3+4) = 1
		
		System.out.println("A:"+a+"\tB:"+b+"\tC:"+c+"\tD:"+d);
		
	}

}
