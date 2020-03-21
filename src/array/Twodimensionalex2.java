package array;

import java.util.Scanner;

public class Twodimensionalex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of the array:");
    
    int size =sc.nextInt();
    
    int ar[][] = new int[size][size];
    
    for(int i=0;i<ar.length;i++){
    	
    	for(int j=0;j<ar.length;j++){
    		
    		System.out.println("Enter the values:");
    		
    		ar[i][j] = sc.nextInt();
    	}
    }
    for(int i=0;i<ar.length;i++){
    	for(int j=0;j<ar.length;j++){
    		
    		System.out.print(ar[i][j]+" ");
    	}
    	System.out.println();
    }
    
	}

}
