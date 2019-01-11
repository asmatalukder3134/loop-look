package Dhaka;

import org.junit.Test;

public class c {
	@Test
	public void abc() {
		int a[]= {44,99,43,90,60};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
