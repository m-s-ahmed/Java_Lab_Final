//Demonstrate FileReader
import java.io.*;
public class FileReaderDemo{
	public static void main(String args[])throws IOException{



       // Get file size using File class
        File file = new File("file1.txt");
        //store a for future uses
       	long a;
        if (file.exists()) {
            System.out.println("File Size: " + (a=file.length()) + " bytes");
        } else {
            System.out.println("File does not exist.");
            return;
        }

//FileReader fr=new FileReader("file1.txt");
//BufferedReader br=new BufferedReader(fr);
//String s;

//s=br.readLine();
//System.out.print(s);
//System.out.println(new File("file1.txt").length());

/*while((s=br.readLine())!=null){
	System.out.println(s);
	}
	fr.close();*/

//int n=10;
/*System.out.println("First "+n+" characters(FileReader):");
for(int i=0;i<n;i++){
	int ch=fr.read();
	if(ch==-1){
		break;
		}
	System.out.print((char)ch);
		}*/

	}
}