package imp_prgm;// 27

public class String_function {

	public static void main(String[] args)
	{
		String s1 = "methodover";
		
		String s2 = "MethodOver";
		
		System.out.println(s1.length());  //10
		System.out.println(s1.indexOf('e'));  //1
		System.out.println(s1.substring(3, 6));  //hod
		System.out.println(s1.substring(6));   //over
		System.out.println(s1.toUpperCase());  //METHODOVER
		System.out.println(s2.toLowerCase());  //methodover
		System.out.println(s1.contains("met")); //true
		System.out.println(s1.startsWith("me")); //true
		System.out.println(s1.endsWith("over"));  //true
		System.out.println(s1.equals(s2));      //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.replace('o', 'A'));  //methAdAver
		System.out.println(s1.toCharArray());  //methodover
		System.out.println(s1.concat("yes"));  //methodoveryes
		System.out.println(s1.charAt(2)); //t
		

	}

}
