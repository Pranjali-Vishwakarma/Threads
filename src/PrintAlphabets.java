// Demonstrates Thread by implementing Runnable
public class PrintAlphabets implements Runnable {
    @Override
    public void run() {
        // Print letters from A to E
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Alphabet thread interrupted.");
            }
        }
    }
}

