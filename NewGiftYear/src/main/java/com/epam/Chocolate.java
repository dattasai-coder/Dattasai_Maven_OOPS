package com.epam;

import java.util.Scanner;

public class Chocolate implements MixtureCount {
	int candy=0,sum=0;
	public int Weight(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	public int CandyCount(int[] b) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b1=20;
		for(int i=0;i<b.length;i++) {
			if(b[i]>=a&&b[i]<=b1) {
				candy++;
			}
		}
		return candy;
	}

}
