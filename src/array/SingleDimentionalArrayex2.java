package array;

import java.util.Scanner;

public class SingleDimentionalArrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		for(int i =0;i<ar.length;i++)
		{
			System.out.println("Enter the value:");
			
			ar[i] = sc.nextInt();
		}
		System.out.println("Display the values in the Array:");
       for(int j =0; j<ar.length;j++){
    	   
    	   System.out.println(ar[j]+" ");
       }
       
       System.out.println("-----------foreach============");
       
       for(int k :ar)
    	   System.out.println(k+" ");
       
       System.out.println(" ");
	}

}
