package com.iodemo;

import java.io.*;

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
			SequenceInputStream inst = new SequenceInputStream(i1, i2);
			int k;
			while ((k = inst.read()) != -1) {
				System.out.print((char) k);
			}
			System.out.println();

			FileOutputStream fous = new FileOutputStream("demo.txt");
			FileOutputStream fous2 = new FileOutputStream("demo2.txt");
			ByteArrayOutputStream baous = new ByteArrayOutputStream();
			baous.writeTo(fous);

			baous.write('A');
			baous.writeTo(fous);
			baous.writeTo(fous2);
			/* ByteArrayInputStream */
			byte[] buf = { 'A', 'B', 'C' };
			ByteArrayInputStream byteArrayIS = new ByteArrayInputStream(buf);

			int ch = 0;
			while ((ch = byteArrayIS.read()) != -1) {
				System.out.println((char) ch);
			}
			/* DataOutputStream */

			DataOutputStream dos = new DataOutputStream(fous2);
			dos.writeInt(68);
			dos.writeBoolean(false);
			dos.writeChars("\n");
			dos.writeDouble(2.5);
			dos.writeInt(10);
			dos.writeDouble(2.1);
			dos.writeInt(10);
			dos.writeInt(45);
			dos.writeInt(10);
			dos.writeBoolean(true);
			dos.writeInt(10);
			dos.writeChar('S');
			dos.writeInt(10);

			DataInputStream inst1 = new DataInputStream(new FileInputStream("demo2.txt"));
			int count = 0;
			byte[] array = new byte[count];
			inst1.read(array);
			for (byte b11 : array) {
				char ch1 = (char) b11;
				System.out.print(ch1);
			}

			/* Example of reading and writing primitive data: */

			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("demo3.txt"));
			dataOutputStream.writeInt(45);
			dataOutputStream.writeFloat(98.7F);
			dataOutputStream.writeLong(123456);
			dataOutputStream.close();
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream("demo3.txt"));
			int intData = dataInputStream.readInt();
			float floatData = dataInputStream.readFloat();
			long longData = dataInputStream.readLong();

			System.out.println(intData);
			System.out.println(floatData);
			System.out.print(longData);
			/*filepermission*/

			
			
			out.close();
			is.close();
			os.close();
			bin.close();
			dataInputStream.close();	

		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			/* close the file */
			
		}

	}

}
