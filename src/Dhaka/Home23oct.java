package Dhaka;

public class Home23oct {
	public static void main(String[] args) {

//reverse a string by words"How are you?"
		StringBuffer sb = new StringBuffer("How are you ?");

		sb.reverse();
		System.out.println(sb);

		// reverse "my two kids are Suha and Saifan"
		StringBuffer r = new StringBuffer("my two kids are Suha and Saifan");
		r.reverse();
		System.out.println(r);

		// is String palindrome?

		String p = "hello";
		StringBuffer sb1 = new StringBuffer(p);
		sb1.reverse();
		String p_rev = new String(sb1);
		if (p_rev.equals(p)) {
			System.out.println("palindrome.");
		} else {
			System.out.println("not a palindrome");
		}
		// is dad a palindrome?
		String d = "dad";
		StringBuffer b = new StringBuffer("dad");
		b.reverse();
		String d_rev = new String(b);

		if (d_rev.equals(d)) 
		{
			System.out.println("palindrome");
		} 
		else 
		{
			System.out.println("not a palindrome");
		}

		String a = "madam";
		StringBuffer c = new StringBuffer(a);
		c.reverse();
		String a_rev = new String(c);

		if (a_rev.equals(a)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}
}
//OK talk to you later :D
