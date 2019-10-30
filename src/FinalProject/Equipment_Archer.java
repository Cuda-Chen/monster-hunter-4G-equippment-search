package FinalProject;

import java.io.File;
import java.util.*;

public class Equipment_Archer {
	public static List<String> AList = new ArrayList<String>();// initialize static List<String> AList
  
  	 public Equipment_Archer() {
  		 
  	 }
  	 
  	 public void Data_a() {
  		 String str = null;
  		 try {
  			 java.io.File file = new File("Data_a.txt");
  			 
  			 Scanner input = new Scanner(file);
  			 
  			 while (input.hasNextLine()) {
  				 str = input.nextLine();
  				 if (str == " ")
  					 break;
  				 AList.add(str);
  			 }
  			 
  			 input.close();
  		 }
  		 catch (Exception e) {
  			 e.printStackTrace();
  		 }
  	 }
}
