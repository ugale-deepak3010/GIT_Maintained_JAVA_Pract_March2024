package OtherTests;

import java.util.Scanner;

class VolatileExample extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running");
        }
    }

    public void stopRunning() {
        running = false;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();

        // Sleep for 1 second
        Thread.sleep(1000);

        example.stopRunning();
        
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
        myObj.close();
        
        try {
        	throw new Exception("Error!");
			//int a= 2/0;
		} catch (Exception e) {
			System.out.println(e);
		}
        
    }
}

