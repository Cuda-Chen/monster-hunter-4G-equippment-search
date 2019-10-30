package FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// A: all type  B: boy  G: girl
// [] name = { type, part, slot, slotNum, skill1, skill1Num, skill2, skill2Num, ...};
public class Equipment_Sword {
	public static List<String> sList = new ArrayList<String>(); // initialize static List<String> sList
	
	public Equipment_Sword() {
		
	}
	
	public void Data_s() {
		String str = null;
		try {
			  java.io.File file_s = new java.io.File("Data_s.txt");
			  
			  Scanner input_s = new Scanner(file_s);
			  
			  while (input_s.hasNextLine()) {
				  str = input_s.nextLine();
				  if (str == " ")
					  break;
				  sList.add(str);
			  }
			  
			  input_s.close();
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		  }
		
		
	}
}