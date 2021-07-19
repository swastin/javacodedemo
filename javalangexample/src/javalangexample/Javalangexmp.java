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
System.out.println("---------------------------------------------");	
//Decode String to its values of integer value
System.out.println(Byte.decode(s2));
System.out.println(Byte.decode(s1));
System.out.println(Byte.decode(s11));
System.out.println("---------------------------------------------");	
// {parseByte}: Parses the string argument as a signed decimal 
System.out.println(Byte.parseByte(s2));
System.out.println(Byte.decode(s1));
System.out.println(Byte.decode(s11));
System.out.println("---------------------------------------------");	
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
System.out.println("---------------------------------------------");	
Character ch= new Character('g');
System.out.println(ch);
Character ch1='s';
Character ch2='1';
Character ch3='@';
System.out.println(ch1);
//checking the character is letter or not
System.out.println(Character.isLetter(ch));
System.out.println(Character.isLetter(ch2));
System.out.println("---------------------------------------------");	
//checking the character is letter or digit not
System.out.println(Character.isLetterOrDigit(ch2));
//check the character is java identifier or not
System.out.println(Character.isJavaIdentifierPart(ch3));
System.out.println(Character.isJavaIdentifierStart(ch1));
System.out.println("---------------------------------------------");	
//Lower,upper,TitleCase
System.out.println(Character.toLowerCase('A'));
System.out.println(Character.toUpperCase('a'));
System.out.println(Character.toTitleCase('y'));
System.out.println("---------------------------------------------");	
//the numeric value represented by the character in the  specified radix.
System.out.println(Character.digit(ch2,2));
//check character is space and white space char
System.out.println(Character.isSpaceChar(' '));
System.out.println(Character.isWhitespace('	'));
System.out.println("---------------------------------------------");	
////compare two character 
//Compares two {@code Character} objects numerically.
System.out.println(ch1.compareTo(' '));
System.out.println(Character.compare(ch1,ch2));
System.out.println("---------------------------------------------");	
System.out.println("=================Double Class==========================");
System.out.println(Double.BYTES);
System.out.println(Double.MAX_EXPONENT);
System.out.println(Double.MIN_EXPONENT);
System.out.println(Double.MAX_VALUE);
System.out.println(Double.MIN_VALUE);
System.out.println(Double.MIN_NORMAL);
System.out.println("---------------------------------------------");	
Double d=1.2;
Double d1=2.5;
Double d3=new Double(3.55);
String s4="2.5";
//convert string into double
System.out.println(Double.parseDouble(s4));
System.out.println("---------------------------------------------");
//isNAN and isInfinite checking  
System.out.println(d.isNaN());
System.out.println(d.isInfinite());
System.out.println(Double.isFinite(d3));
System.out.println("---------------------------------------------");	
//check two double value  equal or not	
System.out.println(	d.equals(d1));
//check  DOUBLE value and  string equal or not
System.out.println(	t.equals(s4));
//compare two double VALUE
System.out.println(d.compareTo(d1));
System.out.println(Double.compare(b1,b2));

//sum,max,min
System.out.println("---------------------------------------------");
System.out.println(Double.sum(d1,d3));
System.out.println(Double.min(d1,d3));
System.out.println(Double.max(d1,d3));


	}
	

}
