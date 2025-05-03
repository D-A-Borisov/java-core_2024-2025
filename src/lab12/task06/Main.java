package lab12.task06;

public class Main {
    private static final Object lock = new Object();
    private static int [] numbers = {56, 13, 25, 51, 10, 15, 79};
    private static int result = 0;
    private static int currentIndex = 0;

    public static void main(String[] args) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        for (int i = 0; i < cores; i++) {
            threads[i] = new Thread(() -> {
                int localResult = 0;
                int sizeBlock = 2;
                while (true) {
                    int startIndex, endIndex;
                    synchronized (lock) {
                        startIndex = currentIndex;
                        endIndex = Math.min(currentIndex + sizeBlock, numbers.length);
                        currentIndex = endIndex;
                        if (startIndex >= numbers.length) {
                            break;
                        }
                    }
                    for (int g = startIndex; g < endIndex; g++) {
                        localResult += numbers[g];
                    }
                }
                synchronized (lock) {
                    result += localResult;
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Сумма элементов в массиве: " + result);
    }
}