import java.io.*;
class Write{
public static void main(String args[]) throws IOException{
int ch;
FileReader fr=null;
try{
fr=new FileReader("abc1.txt");
}
catch(FileNotFoundException e){
System.out.println("File Not Found");
return;
}
while((ch=fr.read())!=-1)
System.out.print((char)ch);
fr.close();
}
}