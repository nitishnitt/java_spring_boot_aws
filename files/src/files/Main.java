package files;

//import necessary packages
import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) throws Exception
	{
	    String temp="",ch="";
	    Scanner sc=new Scanner(System.in);
	    do{
	        
	    System.out.println("Enter Name");
	    String n=sc.nextLine();
	    System.out.println("Enter Phone Number");
	    String pn=sc.nextLine();
	    System.out.println("Enter Email");
	    String e=sc.nextLine();
	    temp+=n+","+pn+","+e+";";
	    System.out.println("Do you want to enter another record(yes/no)");
	    ch=sc.nextLine();
	    }while(ch.equalsIgnoreCase("yes"));
	    File f=FileManager.createFile();
	    FileManager.writeFile(f,temp);
	    String[]s=FileManager.readFile(f);
	    for(int i=0;i<s.length;i++)
	    System.out.println(s[i]);
	    
	}
  
}