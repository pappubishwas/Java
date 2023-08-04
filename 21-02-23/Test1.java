import java.io.*;
class Test1{
public static void main(String args[]) throws IOException{ 
int i=0; 
FileInputStream fin;

try{

fin=new FileInputStream("abc.txt"); 

}
catch(FileNotFoundException e){
System.out.println("File Not Found");

return;
}

do{ 
i=fin.read();

if(i!=-1)
System.out.print((char)i);

}while (i!=-1);

fin.close();

}

}