package FinalProject;



import java.util.*;

public class DataInput {
	public DataInput() {
		
	}
	//public static List<List<String>> aList = new ArrayList<List<String>>();
	public static List<String> aList = new ArrayList<String>(); // initialize static List<String> aList
	//public static List<String> sList = new ArrayList<String>();
	
    public void Data()  {
	  String str = null;
	  
	  try {
	  java.io.File file = new java.io.File("Data.txt");
	  
	  
	  Scanner input = new Scanner(file);
	  
	  
	  while (input.hasNextLine()) {
		  
		  str = input.nextLine();
	  
		  aList.add(str);
	 
	  }
	  
	  input.close();
      
	  }
	  
	  catch (Exception ex) {
		  ex.printStackTrace();
	  }
	  
	  
	 
	  //for (String tmp : aList)
		  //System.out.println(tmp);
	  
	 
  }
}
