package com.clidemo2;

import java.util.Scanner;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CliDemo {

	/**
	 * @param args
	 * @throws ParseException
	 */

	public static void main(String[] args) throws ParseException {

		int no1 = 0;
		int no2 = 0;
		int sum = 0;
		int sub;
		int mul;
		int div;
		Scanner sc = new Scanner(System.in);
		/**
		 * <b>the following lines are usesd to add options to the cli </b>
		 *
		 */
		Options op = new Options();
		op.addOption("ADD", null, false, "Addition of two number");
		op.addOption("SUB", null, false, "Subtraction of two number");
		op.addOption("MUL", null, false, "Multiplication of two number");
		op.addOption("DIV", null, false, "divison of two number");

		/**
		 * 
		 * It is used to create help for command line application
		 * 
		 * 
		 */
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("calc", op, true);
		CommandLineParser cp = new DefaultParser();
		CommandLine cmd = cp.parse(op, args);

		if (cmd.hasOption("ADD")) {
			System.out.println("================ADDITION=================");
			System.out.println("Enter Numbers");
			System.out.println("=================================");
			
			System.out.println("Enter First number");
			no1 = sc.nextInt();
			System.out.println("Enter Second number");
			no2 = sc.nextInt();
			sum = no1 + no2;
			System.out.println("=================================");
			System.out.println("the sum of" + no1 + "+" + no2 + "=" + sum);

		} else if (cmd.hasOption("SUB")) {
			System.out.println("================SUBTRACTIONS=================");
			System.out.println("  Enter Numbers");
			System.out.println("=================================");
			System.out.println("Enter First number");
			no1 = sc.nextInt();
			System.out.println("Enter Second number");
			no2 = sc.nextInt();
			sub = no1 - no2;
			System.out.println("=================================");
			System.out.println("the subtraction  of" + no1 + "-" + no2 + "=" + sub);

		} else if (cmd.hasOption("MUL")) {
			System.out.println("================MULTIPLICATION=================");
			System.out.println("  Enter Numbers");
			System.out.println("=================================");
			System.out.println("Enter First number");
			no1 = sc.nextInt();
			System.out.println("Enter Second number");
			no2 = sc.nextInt();
			mul = no1 * no2;
			System.out.println("=================================");
			System.out.println("the multiplication of" + no1 + "*" + no2 + "=" +mul);

		} else if (cmd.hasOption("DIV")) {
			System.out.println("================DIVISON=================");
			System.out.println("  Enter Numbers");
			System.out.println("=================================");
			System.out.println("Enter First number");
			no1 = sc.nextInt();
			System.out.println("Enter Second number");
			no2 = sc.nextInt();
			div = no1 / no2;
			System.out.println("=================================");
			System.out.println("the divison of" + no1 + "*" + no2 + "=" +div);
		}
		else {
			System.out.println("ENTER A OPTION");
		}
		System.out.println("=============END====================");
		sc.close();
	}

}
