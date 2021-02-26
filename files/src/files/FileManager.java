package files;

//import necessary packages
import java.io.*;
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class FileManager 
{
   
   static public File createFile() 
   {
   File f=new File("C:\\Users\\Santosh\\Desktop\\java projects\\visitors.txt");
   return f;//change the return type as per the requirement    
   }
   static public void writeFile(File f, String record) 
	{
	    FileWriter fw=null;;
		try {
			fw = new FileWriter(f,true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    for(int i=0;i<record.length();i++){
	        try {
				fw.write(record.charAt(i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	static public String[] readFile(File f)  
	{
	    FileReader fr=null;;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    int ch;
	    List<String>list=new ArrayList<>();
	    String temp="";
	    try {
			while((ch=fr.read())!=-1){
			    if((char)ch!=';'){
			        temp+=(char)ch;
			    }
			    else{
			        list.add(temp);
			        temp="";
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return list.toArray(new String[0]);//change the return type as per the requirement  
	}
}