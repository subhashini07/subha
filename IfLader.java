package org.test;

public class IfLader {
	public static void main(String[] arg){
		int a=9;int b=15;
		if(a<9 && b<15){
			System.out.println("Invalid");
		}
		else if(a>10 && b==15 ){
			System.out.println("Invalid");
					}
		else if(a<=9&&b<=15){
			System.out.println("True :" +"\t"+a+"\t"+b);
			
		}
	}
}
