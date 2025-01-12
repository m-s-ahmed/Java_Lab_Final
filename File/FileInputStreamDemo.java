//FileInputStream class

import java.io.*;

class FileInputStreamDemo{
	public static void main(String args[])throws IOException{

		int size;

		InputStream f= new FileInputStream("file1.txt");
		System.out.println("Total Available Bytes: "+(size=f.available()));

		int n=size/2;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		for(int i=0;i<n;i++){
			System.out.print((char)f.read());
			}

		System.out.println("\nStill available: "+f.available());

		System.out.println("Reading the next "+n+" with one read b[]");

		byte b[]=new byte[n];

		if(f.read(b)!=n){
			System.err.println("Couldn't read "+n+" bytes");
			}

			System.out.println(new String (b,0,n));

			System.out.println("Still available: " + f.available());


		}
}
