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
		String s= scan.nextLine();
		char[] ch,ch1;
		for(int i=0; i<n; i++){
			s= scan.nextLine();
			ch = s.toCharArray();
			ch1 = s.toCharArray();
			Arrays.sort(ch1);
	        boolean flag= true;
	        for(int j=0; j<s.length(); j++){
	            if(ch1[j]!=ch[j]){
	                flag=false;
	            }
	        }
	        if(flag){
	            System.out.println("yes");   
	        }
	        else{
	            System.out.println("no"); 
	        }
		}
	}
}