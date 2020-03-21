package simple_examples;

public class Staticdemo {

	 static int sno;
	 
	 static void display(){
		 
		 System.out.println("static method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Directly:"+sno);
		System.out.println("using classname:"+Staticdemo.sno);
		
		Staticdemo demo1 = new Staticdemo();
		
	System.out.println("using reference variable:"+demo1.sno);
	
	Staticdemo demo2 = null;
	
	System.out.println("using reference variable:"+demo2.sno);
	
	display();

	}

}
