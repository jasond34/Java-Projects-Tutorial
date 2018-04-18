/*
 * Write a java program to swap two string 
 * variables without using third or temp variable
 */
public class SwapStringVar {
	public static void main(String[] args)
    {
		String a="blah";
		String b="hah";
		//want a=blah
		//want b=hah
		System.out.println("Strings before swap: a = " + 
                a + " and b = "+b);
		 a = a + b;
		 b = a.substring(0,a.length()-b.length());
		 a = a.substring(b.length());
		
		 System.out.println("Strings after swap: a = " + 
                 a + " and b = " + b);
		
		
/*		str1=str1+" "+str2;   //str1 = "blah hah"
		str2="";
		for(int i=0;i<str1.length();i++) {
			str2=str2+str1.charAt(i); //str2=blah   
			if(str1.charAt(i)==' ') {
				break;
			}
		}
for(int i=str1.length();i<=str1.length()-str2.length();i++) { //str1 still =blah hah
		          
	    str1=
		}
		//System.out.println("str1="+str1);
		System.out.println("str2="+str2);*/
		
		
    }
}
