import java.io.*;
import java.util.Random;

public class Assignment4RandomAccessFileExample {
    public static void main(String[] args) throws IOException {
        String fileName = "random_numbers.txt";
        Random random = new Random();

        // Step 1: Write 50 random numbers to the file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            for (int i = 0; i < 50; i++) {
                int randomNumber = 100 + random.nextInt(51); // Generate random number between 100 and 150
                raf.writeInt(randomNumber); // Write the number to the file
            }
            System.out.println("50 random numbers written to " + fileName);
        }

        // Step 2: Read and display all numbers from the file
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            System.out.println("Numbers in the file:");
            for (int i = 0; i < 50; i++) {
                raf.seek(i * 4); // Each int occupies 4 bytes
                System.out.print(raf.readInt() + " ");
            }
            System.out.println();
        }

        // Step 3: Randomly modify a number in the file
        int positionToModify = random.nextInt(50); // Random position between 0 and 49
        int newNumber = 100 + random.nextInt(51); // Generate a new random number

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            raf.seek(positionToModify * 4); // Seek to the position of the number to modify
            raf.writeInt(newNumber); // Overwrite with the new number
            System.out.println("Modified number at position " + positionToModify + " to " + newNumber);
        }

        // Step 4: Verify the modification
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            System.out.println("Updated numbers in the file:");
            for (int i = 0; i < 50; i++) {
                raf.seek(i * 4);
                System.out.print(raf.readInt() + " ");
            }
            System.out.println();
        }
    }
}
