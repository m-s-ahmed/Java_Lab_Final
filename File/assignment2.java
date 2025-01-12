//Assignment 2
import java.io.*;

public class assignment2{
	public static void main(String args[])throws IOException{

		/*FileInputStream fis1=new FileInputStream("file1.txt");
		FileInputStream fis2=new FileInputStream("f1.txt");

		FileOutputStream fos=new FileOutputStream("fos.txt");

		byte[] buffer1=fis1.readAllBytes();
		fos.write(buffer1,0,buffer1.length/2);

		byte[] buffer2=fis2.readAllBytes();
		fos.write(buffer2,buffer2.length/2,buffer2.length/2);
		//fos.close();*/

		//Using FileReader and FileWriter

		FileReader fr1=new FileReader("file1.txt");
		FileReader fr2=new FileReader("f1.txt");

		FileWriter fw=new FileWriter("fw.txt",true);

		char[] buffer1=new char[1000];
		int len1=fr1.read(buffer1);
		System.out.println(buffer1);
		System.out.println(len1);
		fw.write(buffer1,0,len1/2);

		char[] buffer2=new char[1000];
		int len2=fr2.read(buffer2);
		System.out.println(buffer2);
		System.out.println(len2);
		fw.write(buffer2,len2/2,len2/2);
		fw.flush();//Finalize the output state so that any buffers are cleared.
		// if it’s not closed or flushed, the content may not be saved to the file.
		}
	}