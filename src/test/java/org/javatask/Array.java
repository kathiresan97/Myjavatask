package org.javatask;

import java.util.ArrayList;
import java.util.List;

public class Array {
	
	public static int removeDuplicate() {
		int  b[]= {10,10,20,50,60,80,60,50};
		int n = b.length;
		if (n==0 || n==1) {
			return n;
		}
		int[] temp=new int [n];
		int j=0;
		for (int i = 0; i < n; i++) {
			if (b[i]!=b[i+1]) {
				temp[j++]=b[i];
				}
		}
				temp[j++]=b[n];
				for (int k = 0; k < j; k++) {
					b[k]=temp[k];
					
				}
		for (int i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
		return j;	
		
	}

	public static void main(String[] args) {
		removeDuplicate();
		/*
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of the values : "+sum);
		System.out.println("average of the values : "+sum/10);
		
		*/
		
		
//List l=new ArrayList();
//l.add(10);
//l.add(20);
//l.add(30);
//l.add(90);
//l.add(10);
//l.add(10);
//l.add(40);
//l.add(50);
//
//List i=new ArrayList();
//i.add(30);
//i.add(40);
//i.add(50);
//i.add(60);
//i.add(80);
//
//l.add(2, 100);
//for (int j = 0; j < l.size(); j++) {
//	if (l.get(j).equals(10)) {
//		l.set(j, 5);
//	}
//	
//}
//System.out.println(l);
//
//
	}

}
