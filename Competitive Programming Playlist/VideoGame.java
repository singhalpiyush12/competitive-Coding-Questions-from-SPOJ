/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = scan.nextInt();
		int box[] = new int[n];
		for(int i=0; i<n; i++){
			box[i]= scan.nextInt();
		}
		int com= scan.nextInt();
		int crane= 0;
		boolean status = false;
		while(com!=0){
			switch(com){
				case 1:
					if(crane!=0){
						crane--;
					}
					break;
				case 2:
					if(crane<n-1){
						crane++;
					}
					break;
				case 3:
					if(box[crane]!=0 && status==false){
						box[crane]--;
						status = true;
					}
					break;
				case 4:
					if(box[crane]!=h && status==true){
						box[crane]++;
						status = false;
					}
					break;
				default:
					break;
			}
			com= scan.nextInt();
		}
		for(int j=0; j<n; j++){
			System.out.print(box[j]+" ");
		}
	}
}