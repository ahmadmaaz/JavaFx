package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndCheck {
	public static boolean Read_And_Check(String username, String password,int Key) {
	File db_file = new File("db.txt");
		try {
		Scanner db_read = new Scanner(db_file);
		int i=0;
		String[] accounts_list = new String[200];
	    while (db_read.hasNextLine()) {
	        String data = db_read.nextLine();
	        accounts_list[i]=data;
	        i++;
	      }
	   db_read.close();
	   
	   for (String user_pass: accounts_list) {
		   if(user_pass==null) {break;}
		   String[] account= user_pass.split("//");
		   
		   if (Key==0 && account[0].equalsIgnoreCase(username) && account[1].equals(password)) {
			   return false;
		   } 
		   if (Key==1 && account[0].equalsIgnoreCase(username)) {
			   return false ;
		   }
	   }
	   
		}
		catch (IOException e) {
	      System.out.println("Error ");
	      e.printStackTrace();
	    }
		return true;
		}}
