import java.io.*;
import java.util.*;


public class FileDemo {
   
   public static void main(String[] args) {
      File f = null;
      String strs = "hritik.txt";
      try {
            // create new file
            f = new File(strs);
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
        Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
        
               bout.write(sc.nextLine());
            bout.close();

            String a = f.getAbsolutePath(); 
            
            // prints absolute path and length
 	     System.out.print("\n"+a);
            System.out.print("\nLength =" +f.length());
            
         } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}
