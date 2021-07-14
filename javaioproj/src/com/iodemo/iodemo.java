package com.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class iodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java FileOutputStream Class
		 */
		try {
			/* fileoutputstream */
			FileOutputStream out = new FileOutputStream("demo.txt");
			/* Write character A */
			out.write(65);
			/* Write a string the file */
			String s = "Welcome to java io ";
			byte b[] = s.getBytes();
			out.write(b);
			/* fileinputstream */
			FileInputStream is = new FileInputStream("demo.txt");
			int s1 = is.read();
			int i = 0;
			while ((i = is.read()) != -1) {
				System.out.print((char) i);

			}

			/* BufferedOutputStream */

			OutputStream os = new BufferedOutputStream(out);

			String s11 = "Welcome to java.";
			byte b1[] = s11.getBytes();
			os.write(b);
			os.flush();
			/* BufferedinputStream */
			BufferedInputStream bin = new BufferedInputStream(is);
			int j;
			while ((j = bin.read()) != -1) {
				System.out.print((char) j);
			}
			/* SequenceInputStream */
			FileInputStream i1 = new FileInputStream("demo.txt");
			FileInputStream i2 = new FileInputStream("demo2.txt");
			SequenceInputStream inst=new SequenceInputStream(i1,i2);    
			   int k;    
			   while((k=inst.read())!=-1){    
			    System.out.print((char)k);    
			   }    
			   System.out.println(); 
			   
	FileOutputStream fous=new FileOutputStream("demo.txt");
	FileOutputStream fous2=new FileOutputStream("demo2.txt");
	ByteArrayOutputStream baous=new ByteArrayOutputStream()	; 
	baous.writeTo(fous);
			   
	baous.write('A');    
	baous.writeTo(fous);    
	baous.writeTo(fous2); 
	/* ByteArrayInputStream*/		   
	byte[] buf= {'A','B','C'};
	ByteArrayInputStream byteArrayIS = new ByteArrayInputStream(buf);
	
	int ch = 0;  
	while ((ch = byteArrayIS.read()) != -1) 
	{  
		System.out.println((char) ch); 
	}    		   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			/* close the file */
			out.close();
			is.close();
			os.close();
			bin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
