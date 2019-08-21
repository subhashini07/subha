package org.test;

public class FibonaSeri {
	public static void main(String[] arg){
		long a=0;long b=1;long c=0;
		System.out.println("\t"+a +"\n"+b);
		for( int i=1;i<=50;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		
	}

}
}
