package com.epam;

import java.util.Scanner;

public class CalculateCandies {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many chocolates : ");
		int c=sc.nextInt();
		int ch[]=new int [c];
		for(int i=0;i<c;i++) {
			ch[i]=sc.nextInt();
		}
		System.out.println("Enter how many sweets : ");
		int s=sc.nextInt();
		int sw[]=new int[s];
		for(int j=0;j<s;j++) {
			sw[j]=sc.nextInt();
		}
		Chocolate co=new Chocolate();
		int r1=co.CandyCount(ch);
		int r2=co.Weight(ch);
		Sweets so=new Sweets();
		int r3=so.CandyCount(sw);
		int r4=so.Weight(sw);
		
		
		System.out.println("Candies Count : "+(r1+r3));
		System.out.println("Bag weight : "+(r2+r4));
	}

}
