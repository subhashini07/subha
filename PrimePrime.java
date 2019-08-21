package org.test;

public class PrimePrime {
	public static void main(String[] arg){
		for(int num=1;num<=100;num++){
			System.out.println("num"+num);
			for(int i=2;i<=num;i++){
				System.out.println("i"+i);
				if(num%i==0){
					System.out.println("num%i"+num%i);
					if(i<num){
						//System.out.println("Not a PrimeNumber");this is used to break the loop
						break;
					}else{
						System.out.println("Prime"+num);
					}
					
						
				}else{
					System.out.println("num%i"+num%i);
				}
			}
		}
	}

}

