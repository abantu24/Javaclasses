package simple_examples;

public class Shallowclonning {

	int b=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shallowclonning SC = new Shallowclonning();
		
		Shallowclonning c = SC;//shallow clonning
		
		System.out.println(SC.b+"\t"+c.b);
		
		new Shallowclonning().b = 1000;
		
		System.out.println(SC.b+"\t"+c.b);
	}

}
