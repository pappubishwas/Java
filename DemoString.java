import java.util.*;
public class DemoString
{
public static void main(String args[])
{
//String s2= args[0];
Scanner s= new Scanner(System.in);
System.out.println("Enter a String");
String s1= s.nextLine();
String s2= s.nextLine();
//System.out.println(s1);
String s3= s1+" "+s2;
System.out.println(s3);
String ss[]=new String[4];
int i=0;
String words[]=s3.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
for(String w:words){
//System.out.println(w);
ss[i]=w;
i++;
}
System.out.println("The fisrt string is:" +ss[0]);
System.out.println("The second string is:" +ss[1]);
System.out.println("The three string is:" +ss[2]);
System.out.println("The four string is:" +ss[3]);
}
}