package Files;
import java.io.IOException;  
import java.nio.file.*;  

public class Demo 
{
public static void main(String[] args)   
{  
Path path = Paths.get("C:\\javaprogram.txt"); //creates Path instance  
try   
{  
Path p= Files.createFile(path);     //creates file at specified location  
System.out.println("File Created at Path: "+p);  
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  
}  
}  
