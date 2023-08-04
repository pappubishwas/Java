import java.io.*;
class Test{
public static void main(String args[]) throws IOException{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("abc.txt");
System.out.println("Enter @ to end");
char ch;
while((ch=(char)dis.read())!='@')
fout.write(ch);
fout.close();
}
}