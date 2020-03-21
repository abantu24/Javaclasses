package thisex;

public class ThisDemo {
	
	int i =1000;
	int j=800;
	static int k=600;
	
	void funA(int i){
		
		System.out.println("Before This Keyword:");
		System.out.println(i+"\t"+j+"\t"+k);
		
		System.out.println("After This Keyword:");
		System.out.println(this.i+"\t"+this.j+"\t"+this.k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo demo = new ThisDemo();
		
		demo.funA(100);

	}

}
