import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the name of the input file: ");
        String inputFile = null;
        try {
            inputFile = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        System.out.print("Enter the name of the output file: ");
        String outputFile = null;
        try {
            outputFile = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[1024];
            int length;
            
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
