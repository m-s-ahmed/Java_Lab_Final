//Thread practice1

//class task1 implements Runnable{}
class task1 extends Thread{
	public void run(){
		            for (char c = 'A'; c <= 'Z'; c++) {
		                System.out.print(c + " ");
		            }
		            for (char c = 'a'; c <= 'z'; c++) {
		                System.out.print(c + " ");
		            }
            		System.out.println(); // Add a newline after finishing
		}
	}

class task2 extends Thread{
	public void run(){
					for (int i = 0; i < 100; i++) {
		                System.out.print("@ ");
		            }
            		System.out.println(); // Add a newline after finishing
		}
	}

class task3 extends Thread{
	public void run(){
		            for (int i = 1; i <= 100; i++) {
		                System.out.print(i + " ");
		            }
            		System.out.println(); // Add a newline after finishing
		}
	}
public class test{
	public static void main(String args[])throws InterruptedException{
			task1 t1=new task1();
			t1.start();
			t1.join();// Wait for task1 to complete

			//Thread th=new Thread(t1);
			//th.start();

			task2 t2=new task2();
			t2.start();
			t2.join();// Wait for task2 to complete

			task3 t3=new task3();
			t3.start();
			t3.join();// Wait for task3 to complete
		}
	}

	//it's shows sequential problem