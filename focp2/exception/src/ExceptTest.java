import java.lang.Exception;
class ExceptTest 
{ 
public static void main(String[] args)
{

try{
	Exception a=new Exception("abcd");
throw a; 
} 
catch(Exception e) {
	System.out.println(e);
}
finally 
{ 
System.out.println("i will get printed"); 
} 
}
 }