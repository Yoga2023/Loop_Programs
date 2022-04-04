package com.loop;

public class Loop_Program {

	public static void main(String[] args) {
		int row,col;
		int count=7;
		for(row=4;row>=1;row--) {
			for(col=1;col<=row;col++) {
				System.out.print(count+" ");
				count++;
			} 
			count--;
			
			count=count-((row-1)*2);
			System.out.println();
	}

}

}
