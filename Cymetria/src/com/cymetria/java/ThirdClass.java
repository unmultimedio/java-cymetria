package com.cymetria.java;

public class ThirdClass {

	public static void main(String[] args) {
		String[][]tricky = new String[][]
				{
					{"A","B","C"},
					{"D","E","F"},
					{"G","H","I"}
				};
		
//		for(int i=0; i<3; i++){
//			for(int j=0; j<3; j++){
//				tricky[i][j] = " pos("+i+")("+j+") ";
//			}
//		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(tricky[i][j]);
			}
			System.out.print("\n");
		}
	}

}
