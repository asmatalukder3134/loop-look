package Dhaka;

import java.util.Arrays;

public class practice3 {
	public static  void main (String[]args, int i) {
		int []a= {99,45,65,76,29};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.err.println(a[i]);   
		}
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
		
	}
	int max=a[0];
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]>max)
    	 {
    		 max=a[i];
    	 }
    	 System.out.println(max);
     }
     
     {
    	 if(a[i]<max);
    	 {
    		 max=a[i];
    	 }
     }
		
	}

}
