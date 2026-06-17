package com.swapping;

public class SwappingWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b=20; 
		int c=30;
		int d=40;
		
		
		System.out.println("Here we used Before variables "+a+" \t"+b+" "+ c+ " "+d);
		a=a+b+c+d;//100
		b=a-(b+c+d);//100-(20+30+40)=100-90=>10
		c=a-(b+c+d);//100-(10+30+40)=>100-80=20
		d=a-(b+c+d);//100-(10+20+40)=>30
		a=a-(b+c+d);//100-(10+20+30+40)=>100-100=0
		 
		System.out.println("Here we used After variables " +a+" \t" +b+" "+ c+ " "+d);

	}

}
