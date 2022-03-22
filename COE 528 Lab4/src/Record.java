import java.io.*;
import java.util.*;

public class Record
{
    private static Record Instance;
    //Name of the associated file
    private static String Filename;
    
            public Record(String n)
            {
                Filename = n;
            }
            
            private static Record getInstance()
            {
                if(Instance == null)
                    Instance = new Record("record.txt");
                return Instance;
            }
            
            //Effects: Reads and prints the contents of the associated      
            // file to the standard output.
            public void read() 
            {         
                try
                {
                    FileReader File = new FileReader("record.txt");
                    Scanner Reader = new Scanner(File);
                    while(Reader.hasNextLine())
                    {
                        String FileData = Reader.nextLine();
                        System.out.println(FileData);
                    }
                    Reader.close();    
                }
                catch(IOException e)
                {
                    System.out.println("An error occurred.");             
                    e.printStackTrace();
                }
            }
            
            public void write(String msg) 
            {         
                try 
                { 
                    FileWriter Writer = new FileWriter("record.txt", true);
                    Writer.write(msg);
                    Writer.close();
                } 
                catch(IOException e) 
                {             
                    System.out.println("An error occurred.");             
                    e.printStackTrace();         
                }     
            }
            
            public static void main(String[] args)
            {
                Record r = Record.getInstance();
                
                //Do not modify the code below
                r.write("Hello-1\n");
                r.write("Hello-2\n");
                
                System.out.println("Currently the file record.txt "
                        + "contains the following lines:");
                
                r.read();
            }
 
}