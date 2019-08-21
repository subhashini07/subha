package org.test;

public class SumOdd {
	public static void main(String[] arg){
		int sum=0;
		for(int num=1;num<=100;num++){
			if(num%2!=0){
				sum=sum+num;
				System.out.println(sum);
			}
		}
	}

}
