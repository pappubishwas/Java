import java.io.*;
class Copy{
public static void main(String args[]) throws IOException{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int i=0;
FileInputStream fin;
FileOutputStream fout;
try{
        System.out.print("Enter the name of the input file: ");
        String inputFile = null;
inputFile=reader.readLine();
fin=new FileInputStream(inputFile);
}
catch(FileNotFoundException e){
System.out.println("File Not Found");
return;
}
try{
        System.out.print("Enter the name of the output file: ");
        String outputFile = null;   
        outputFile=reader.readLine(); 
fout=new FileOutputStream(outputFile);
}
catch(FileNotFoundException e){
System.out.println("Errorin Opening File");
return;
}
try{
do{
i=fin.read();
if(i!=-1)
fout.write(i);
}while(i!=-1);
}
catch(IOException e){
System.out.println("File Error");
}
fin.close();
fout.close();
}
} 