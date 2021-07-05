package com.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
public class DemoCli {
	public static void main(String[] args) {
		Options op =new Options();
		op.addOption("t",false,"display current time");
		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine cmd = parser.parse(op, args);
			
			if(cmd.hasOption("t")) {
			    System.out.print("This is the testing cli");
			}
			else {
			    // print the date
				System.out.print("This is the error testing cli");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
