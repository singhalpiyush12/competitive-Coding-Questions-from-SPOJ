import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String g[];
		int j;
		char c1,c2,c3,c4;
		boolean s1=false,s2=false;
		for(int i=0; i<t; i++){
			g= new String[4];
			for(j=0; j<4; j++){
				g[j]= scan.nextLine();
			}
			Arrays.sort(g);
			c1= g[0].charAt(10);
			c2= g[1].charAt(6);
			c3= g[2].charAt(7);
			c4= g[3].charAt(11);
			if(Character.getNumericValue(c1) > Character.getNumericValue(c2)){
			    s1= true;
			}
			if(Character.getNumericValue(c3) > Character.getNumericValue(c4)){
			    s2= true;
			}
			if(s1==true && s2==true){
			    System.out.println("Barcelona");
			}
			else{
			    System.out.println("RealMadrid");
			}
	    }
	}
}