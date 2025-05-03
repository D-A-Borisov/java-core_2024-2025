package lab12.task04;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i;
            threads[i] = new Thread(() -> {
                System.out.println("Поток номер: " + threadNumber);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}