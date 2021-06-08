package com.cg.demo.basic;

public class TwoDimArr {

	public static void main(String[] args) {

		int[][] arr = new int [3][4];
//		int arr1[][] = new int[4][5];

//		int arr1[][] = new int[][]
//		{  
//			new int[] {1,8,5,9},
//			new int[] {1,8,5},
//			new int[] {1,8,5,9,48}
//		};
		arr[0][0] = 76;
	 	arr[0][1] = 36;
		arr[0][2] = 736;
		arr[0][3] = 736;
		arr[1][2] = 726;
		arr[1][1] = 746;
		arr[1][0] = 576;
		arr[1][3] = 736;
		arr[2][0] = 676;
		arr[2][1] = 766;
		arr[2][2] = 746;
		arr[2][3] = 736;
//		arr[3][0] = 676;
//		arr[3][1] = 766;
//		arr[3][2] = 746;
//		arr[3][3] = 736;
//		
		
		for( int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print (arr[i][j]+" ");
			}
			System.out.println(" ");
		}
			
		
	}

}
