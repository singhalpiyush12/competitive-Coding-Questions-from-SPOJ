/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		for(int i=0; i<n; i++){
			a[i]= scan.nextInt();
			b[i]= scan.nextInt();
		}
		int lead,maxLead=0;
		int t1=0,t2=0;
		int win=1;
		for(int k=0; k<n; k++){
			t1+=a[k];
			t2+=b[k];
			lead = Math.abs(t1-t2);
			if(lead>maxLead){
				maxLead=lead;
				if(t2>t1){
					win=2;
				}
				else{
					win=1;
				}
			}
		}
		if(win==1){
			System.out.println("1 "+ maxLead);
		}
		else{
			System.out.println("2 "+ maxLead);
		}
	}
}