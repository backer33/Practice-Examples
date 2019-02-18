package com.xoriant.nilesh;

public class StringReverse {

	public static void main(String[] args) {
		
		StringBuffer br = new StringBuffer("I Love my India");
										  //0123456789
		
		int i=0,start=0,end=0;
		while(i<br.length()) {
			
			if(br.charAt(i)== ' '|| i==br.length()-1) {
				if(br.charAt(i)== ' ') {
				end = i-1;
				}else {
					end = i;
				}
				resverseWord(br,start,end);
				start=i+1;
				end=0;
			}
			 i++;
		}//while end
		
		System.out.println(br.reverse());
				
	}// main method end
	
	
	public static void resverseWord(StringBuffer br, int start, int end) {
		
		
		while(start<=end) {
			char ch =br.charAt(start);
			char cha =br.charAt(end);
			br.setCharAt(start, cha);
			br.setCharAt(end, ch);
			start++;
			end--;
		}
		
		
	}
}// class end
