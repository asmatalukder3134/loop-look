package Dhaka;

import java.util.Arrays;

public class Newhomew { 
	public static void main(String[] args) throws InterruptedException {
			
	String s= "how are you";
    String s2=s.concat(" working ?");
	StringBuffer sb= new StringBuffer("why");
	sb.append(" you are late?");
	
	System.out.println(s2);
	System.out.println(sb);
	String s1=new String ("how are you");
	s.length();
	s.substring(2, 3);
	s.charAt(2);
	s.indexOf(s2);
	s.substring(2);
	
	Thread.sleep(2000);
	String[]flowers = {"dalia","Rose","Lily","Lotus"};
	Arrays.sort(flowers);
	for(int i=0;i<flowers.length;i++) {
	
	System.out.println(flowers[i]);}
	
	for(int i=flowers.length-1;i>=0;i--) {
		System.out.println(flowers[i]);
		}
	
	//ASSENDING AND DESENDING NUMBER
	 int []abc= {2,9,4,28,26};
	 Arrays.sort(abc);
	 for(int i=0; i<abc.length; i++)
	 {
		 System.out.println(abc[i]);
	 }
	
	
	//"united states of America"get second "a" from String.
	
	String h = "united states of America";
	String j = "hello, how are you, Shamama?";
	String k = "adl;kfhasdkfhaslfjaoghdsjk";
	h = j;
	
	int count = 0;
	for(int i = 0; i < h.length(); i++)
	{
		if(h.charAt(i) == 'a' || h.charAt(i) == 'A')
		{
			count = count + 1;
		}
		if(count == 4)
		{
			System.out.println(h.charAt(i));
			System.out.println(i);
			break;
		}
	}
	System.out.println("Done!");
	
	
	
	
	
		 
	
	
	

}}
