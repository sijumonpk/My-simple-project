package transport_contractpack;

import java.util.Scanner;

public class Contract {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 int n,i;
	 System.out.println("Enter the number of applications");
	 n = sc.nextInt();
	
	 System.out.println("Enter the amount(in crores)");
     
	 int arr[] = new int[n];
     for(i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
	 int temp=0;
	 for(i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
		 }
	 }
	 System.out.println("The winning bid is "+arr[0]+"crores");
	 
	}

}
