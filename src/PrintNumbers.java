// Demonstrates Thread by extending Thread class
public class PrintNumbers extends Thread {
    @Override
    public void run() {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Simulate time-consuming task
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
    }
}
