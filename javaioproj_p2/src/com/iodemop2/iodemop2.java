package com.iodemop2;

import java.io.*;

public class iodemop2 {

	public static void main(String[] args) throws Exception {
		
		/*PrintStream*/
		
		String str="Welcome to land of java";
		PrintStream ps= new PrintStream("createFile.txt");
		ps.print(str);
		ps.println();
		ps.println("this is the demo verson of print stream");
		ps.println();
		ps.printf("I have %d apple in my basket",10);
		ps.println();
		ps.format("this is the demo of %d,%d",10,10);
		
		
		
		

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
		/**************************
		 * File handling using java|
		 *************************/
		/* Create File */
		File f = new File("createFile.txt");
		if (f.createNewFile()) {

			System.out.println("successfully created");

		} else {

			System.out.println("not created successfully ");
		}

		System.out.println("----------------------------------------------------------------------------------");
//		System.out.println("FileName"+"\t"+"AbsolutePath"+"\t\t\t\t\t\t"+"canWrite"+"\t"+"canRead"+"\t"+"size");
		System.out.println("------------------------------------------------------------------------------------");

		if (f.exists()) {

			System.out.println("file name\t" + f.getName());
			System.out.println("absolute path\t" + f.getAbsolutePath());
			System.out.println("Is file writeable?:\t " + f.canWrite());
			System.out.println("Is file readable\t " + f.canRead());
			System.out.println("The size of the file in bytes is:\t " + f.length());

		} else {

			System.out.println("not created successfully ");
		}
		
		
		/*Create directory*/
		
		File f1 = new File("demodirectory1");
		if(f1.mkdir()) {
			System.out.println("directory successfully created");	
			
			
		}
		else {
			System.out.println("directory not created successfully ");
			
		}
		/*See all the list of files and directory*/
		
		File f2 = new File("demodirectory");
		String[] paths=f2.list();
		for(String path:paths){
			System.out.println(path);		
		}
	/*file delete*/	
		if(f1.delete()) {
			System.out.println("directory deleted successfully created");	
			
			
		}
		else {
			System.out.println("directory not deleted successfully ");
			
		}
		
		/*Rename the file*/
		File f3 = new File("demodirectory2");
		f2.renameTo(f3);
	
		
	}
}
