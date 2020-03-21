package array;

public class SingleDimensionalArrayex2 {
	
	int ar[] = {250,360,850};
	char ch[]={'s','A','C'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleDimensionalArrayex2 demo =new SingleDimensionalArrayex2();
		for(int i =0;i<demo.ar.length;i++){
			
			System.out.print(demo.ar[i]+" ");
		}
		
		System.out.println();
		System.out.println("====================================");
		
		for(int j=0;j<demo.ar.length;j++){
			
			System.out.print(demo.ch[j]+" ");
		}
		System.out.println();

	}

}
