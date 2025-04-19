/*
Name: Pranjali Vishwakarma
PRN: 23070126092
Batch: SY AIML B1
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Threads Demo...\n");

        // Thread using Thread class
        PrintNumbers numbersThread = new PrintNumbers();
        numbersThread.start(); // Start thread

        // Thread using Runnable interface
        Thread alphabetsThread = new Thread(new PrintAlphabets());
        alphabetsThread.start(); // Start thread

        // Another Runnable
        Thread messageThread = new Thread(new RunnableMessage("Hello from another thread!"));
        messageThread.start(); // Start thread
    }
}
