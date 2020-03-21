package array;

public class Sorting {
	
	static void bubbleSort(int []sort){
		
		int temp=0;
		for(int i =0;i<sort.length;i++)
		{
			for(int j=1;j<sort.length;j++)
			{
				if(sort[j-1]>sort[j])
				{
					temp = sort[j-1];
					sort[j-1] = sort[j];
					sort[j] = temp;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {10,20,30,5,2,1};
		System.out.println("Before sorting the values of teh array are:");
		for(int i =0;i<ar.length;i++){
			
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		bubbleSort(ar);
		
        System.out.println("After Sorting the array is :");
        for(int i =0;i<ar.length;i++){
			
			System.out.print(ar[i]+" ");
		}
	}

}
