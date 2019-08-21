package org.test;

public class SumPrime {
	public static void main(String[] arg){
		int sum=0;
		for(int num =1;num<=15;num++){
			for(int i=2;i<=num;i++){
				if(num%1==0){
					if(i<num){
						sum=sum+num;
						System.out.println(sum);
					}
				}
			}
		}
	}

}
