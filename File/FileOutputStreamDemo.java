//Demonstrate FileOutputStream
import java.io.*;
public class FileOutputStreamDemo{
	public static void main(String args[])throws IOException{
		String source="Now is the time for all good men\n"+"to come to the aid of their county\n"+"and pay their taxes.";
		byte buf[]=source.getBytes();
		//System.out.println(buf);

		OutputStream f0=new FileOutputStream("f0.txt");
		for(int i=0;i<buf.length;i+=2){
			f0.write(buf[i]);
			}
		f0.close();

		OutputStream f1=new FileOutputStream("f1.txt");
		f1.write(buf);
		f1.close();

		OutputStream f2=new FileOutputStream("f2.txt");
		f2.write(buf,buf.length-buf.length/4,buf.length/4);
		f2.close();
		}
	}