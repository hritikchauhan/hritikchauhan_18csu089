import java.io.*;
import java.util.*;
 class FileDemo1 {
   
   public static void main(String[] args) {
      File a = null;
            try {
         
              File f = new File("hritik.txt");
              FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
 	      String sr;
	      System.out.println("The contents of the file are: ");	
		 while((sr=bin.readLine())!=null){
                         System.out.println(sr);
			} 
		}
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
     }
 } }
