//Train seat identifier
package train_seat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{ 
		
	  Scanner sc = new Scanner(System.in);
	  int n,i;
	  n = sc.nextInt();
	  
	  for(i=1;i<=n;i++)
	  {
	    if((n%4 == 1) && (n %8 == 1))
	    {
	    	System.out.println("Lower Side berth");
	    	break;
	    }
	    
	    else if((n%4==1) && (n%8 == 5))
	    {
	     System.out.println("Upper side berth");
	     break;
	    }

	    else if((n%4==2) && (n%8 == 2))
	    	{
	    		System.out.println("Upper Left berth");
	    		break;
	    	}
	    else if((n%4==2) && (n%8==6))
	    	{
	    		System.out.println("Upper right berth");
	    		break;
	    	}
	    		
	    else if((n%4==3) && (n%8 == 3))
		    	{
		    		System.out.println("Middle Left berth");
		    		break;
		    	}
	    else if((n%4==3) && (n%8 == 7))
		    	{
		    		System.out.println("Middle right berth");
		    		break;
		    	}
	    		
	    else if((n%4==0) && (n%8 == 4 ))
		    	{
		    		System.out.println("Lower left berth");
		    		break;
		    	}
	    else if((n%4==0) && (n%8 == 0))
		    	{
		    		System.out.println("Lower right berth");
		    		break;
		    	}
	    else
	    	System.out.println("Invalid seat number");

	  }}}