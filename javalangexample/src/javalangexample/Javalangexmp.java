package javalangexample;

public class Javalangexmp {

	public static void main(String[] args) {
		/*Boolean class*/
		System.out.println("=================Boolean class==========================");	
		Boolean t=true;
		Boolean f=false;
		String s="true";
		// parse string value of true or false to boolean
		System.out.println(Boolean.parseBoolean(s));
		//check two boolean value equal or not
		System.out.println("------------------------------------------------");
		System.out.println(	t.equals(f));
		//check  boolean value and  string equal or not
		System.out.println(	t.equals(s));
		//check   boolean value and  parsed string is equal or not
		System.out.println(	t.equals(Boolean.parseBoolean(s)));
		//compare  two boolean value
		System.out.println("-------------------------------------------------");
		System.out.println(	t.compareTo(f));
		//compare  boolean value and  string 
		System.out.println(	t.compareTo(Boolean.parseBoolean(s)));
		//logical and
		System.out.println("-----------------------------------------------");
		System.out.println(Boolean.logicalAnd(t, f));
		System.out.println(Boolean.logicalAnd(t, t));
		System.out.println(Boolean.logicalAnd(f, f));
		//logical or
		System.out.println("--------------------------------------------");
		System.out.println(Boolean.logicalOr(t, f));
		System.out.println(Boolean.logicalOr(t, t));
		System.out.println(Boolean.logicalOr(f, f));
		//logical xor
		System.out.println("--------------------------------------------");
		System.out.println(Boolean.logicalXor(t, f));
		System.out.println(Boolean.logicalXor(t, t));
		System.out.println(Boolean.logicalXor(f, f));
/***********************
 * Byte Class
 * **********************/
		
System.out.println("=================Byte class==========================");	
//size of byte
System.out.println(Byte.SIZE);
//minimum size
System.out.println(Byte.MIN_VALUE);
//maximum size
System.out.println(Byte.MAX_VALUE);
System.out.println("---------------------------------------------");	

Byte b=65;
Byte b1=0x67;
Byte b2=023;

String s11="65";
String	s1="0x67";
String	s2="023";
//compare two byte{byte by byte}
System.out.println(b.compareTo(b1));
System.out.println(Byte.compare(b1,b2));
//Decode String to its values of integer value
System.out.println(Byte.decode(s2));
System.out.println(Byte.decode(s1));
System.out.println(Byte.decode(s11));
// {parseByte}: Parses the string argument as a signed decimal 
System.out.println(Byte.parseByte(s2));
System.out.println(Byte.decode(s1));
System.out.println(Byte.decode(s11));

/***********************
 * Charecter Class
 * **********************/
		
System.out.println("=================Character Class==========================");

//size of byte
System.out.println(Character.SIZE);
//minimum size
System.out.println(Character.MIN_VALUE);
//maximum size
System.out.println(Character.MAX_VALUE);
Character ch= new Character('g');
System.out.println(ch);
Character ch1='s';
Character ch2='1';
Character ch3='@';
System.out.println(ch1);
//checking the character is letter or not
System.out.println(Character.isLetter(ch));
System.out.println(Character.isLetter(ch2));
//checking the character is letter or digit not
System.out.println(Character.isLetterOrDigit(ch2));
//check the character is java identifier or not
System.out.println(Character.isJavaIdentifierPart(ch3));
System.out.println(Character.isJavaIdentifierStart(ch1));
//Lower,upper,TitleCase
System.out.println(Character.toLowerCase('A'));
System.out.println(Character.toUpperCase('a'));
System.out.println(Character.toTitleCase('y'));
//the numeric value represented by the character in the  specified radix.
System.out.println(Character.digit(ch2,2));
//check character is space and white space char
System.out.println(Character.isSpaceChar(' '));
System.out.println(Character.isWhitespace('	'));
////compare two character 
//Compares two {@code Character} objects numerically.
System.out.println(ch1.compareTo(' '));
System.out.println(Character.compare(ch1,ch2));

	}
	

}
