import java.io.*;

class Read{

public static void main(String args[]) throws IOException{
int i;
String str="Hello Java";
FileWriter fw=new FileWriter("abc1.txt");
for(i=0; i<str.length();i++)
fw.write(str.charAt(i));

fw.close();
}

}