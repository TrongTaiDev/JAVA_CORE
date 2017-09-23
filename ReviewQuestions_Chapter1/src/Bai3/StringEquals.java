package Bai3;

public class StringEquals {
	public static void main(String argn[]) {
		String s1 = "Vietnam";
		String s2 = new String(s1);
		
		//show
		if(s1 == s2) System.out.println("s1 == s2");
		if(s1.equals(s2)) System.out.println("s1 equals s2");		
	}
}
