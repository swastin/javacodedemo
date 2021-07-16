package com.iodemop2;

import java.io.*;

public class iodemop2 {

	public static void main(String[] args) throws Exception {

		/* File writer */
		Writer w = new FileWriter("filewriter.txt");
		CharSequence char_seq = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 \n \t";
		w.append(char_seq);
		w.write("hello world guys");
		w.close();
		/* filereader */
		Reader r = new FileReader("filewriter.txt");
		int i = 0;
		while ((i = r.read()) != -1) {
			System.out.println(i + "\t" + (char) i);

		}
		System.out.println("Character encoding of fileReader1: " + ((InputStreamReader) r).getEncoding());
		
		File f=new File("createFile.txt");
		if(f.createNewFile()) {
			
			System.out.println("successfully created");
			
		}
		else {
			
			System.out.println("not created successfully ");	
		}
		
		System.out.println("----------------------------------------------------------------------------------");
//		System.out.println("FileName"+"\t"+"AbsolutePath"+"\t\t\t\t\t\t"+"canWrite"+"\t"+"canRead"+"\t"+"size");
		System.out.println("------------------------------------------------------------------------------------");
		
if(f.exists()) {
			
			System.out.println("file name\t"+f.getName());
			System.out.println("absolute path\t"+f.getAbsolutePath());
			System.out.println("Is file writeable?:\t " + f.canWrite());
			System.out.println("Is file readable\t " + f.canRead());
			System.out.println("The size of the file in bytes is:\t " + f.length());
			

}
		else {
			
			System.out.println("not created successfully ");	
		}
		
		
		
		
		
		
		
		
	}
}

	


