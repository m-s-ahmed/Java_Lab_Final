//Thread Assignment


public class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException{


        // Task 1: Print letters A-Z and a-z
        Thread task1 = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(c + " ");
            }
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println(); // Add a newline after finishing
        });



		/*
		Thread task1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		        for (char c = 'A'; c <= 'Z'; c++) {
		            System.out.print(c + " ");
		        }
		        for (char c = 'a'; c <= 'z'; c++) {
		            System.out.print(c + " ");
		        }
		        System.out.println();
		    }
});
		*/


        // Task 2: Print '@' 100 times
        Thread task2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("@ ");
            }
            System.out.println(); // Add a newline after finishing
        });

        // Task 3: Print numbers 1 to 100
        Thread task3 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Add a newline after finishing
        });

        // Start all threads
        task1.start();
        task1.join();// Wait for task1 to complete

        task2.start();
        task2.join();// Wait for task2 to complete

        task3.start();
        task3.join(); // Wait for task3 to complete
    }
}
