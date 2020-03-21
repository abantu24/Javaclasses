package simple_examples;

public class Product {
	
	int pid;
	String pname;
	
	void display(){
		
		pid = 100;
		pname="Anusha";
		
		System.out.println(pid+"\t"+pname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pd = new Product();
		
		System.out.println(pd.pid+"\t"+pd.pname);
		
		pd.display();
		
		System.out.println(pd.pid+"\t"+pd.pname);
		
		

	}

}
