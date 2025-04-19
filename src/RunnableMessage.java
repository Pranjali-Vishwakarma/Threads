// Another Runnable to demonstrate parameter passing
public class RunnableMessage implements Runnable {
    private final String message;

    public RunnableMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // Print the message 3 times
        for (int i = 1; i <= 3; i++) {
            System.out.println("Message [" + i + "]: " + message);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Message thread interrupted.");
            }
        }
    }
}
