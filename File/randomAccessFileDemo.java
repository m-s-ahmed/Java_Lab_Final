//RandomAccessFile

import java.io.*;

public class randomAccessFileDemo{
	public static void main(String args[])throws IOException{
		try(
			//create a random access file
			RandomAccessFile raf=new RandomAccessFile("inout.txt","rw");
			)
				{
					//clear the file to destroy the old contents if exists
					raf.setLength(0);

					//write new integers to the file
					for(int i=0;i<200;i++){
						raf.writeInt(i);
						}

					//display the current length of the file
					System.out.println("Current file length is: "+raf.length());

					//retrieve the first number
					raf.seek(0*4);//move the file pointer to the beginning
					System.out.println(" The first number is "+raf.readInt());

					//retrieve the second number
					raf.seek(1*4);
					System.out.println("The second number is "+raf.readInt());

					//retrieve the tenth number
					raf.seek(9*4);
					System.out.println(" The tenth number is "+raf.readInt());

					//Modify the eleventh number
					raf.writeInt(555);
					raf.seek(10*4);
					System.out.println("The modified eleventh number is "+raf.readInt());

					//append a new number
					raf.seek(raf.length());//move the file pointer to the end
					raf.writeInt(999);

					//display the new length
					System.out.println("The new length is "+raf.length() );
				}
		}
	}