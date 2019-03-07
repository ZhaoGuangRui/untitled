public class PrintA implements Runnable {
    @Override
    public void run() {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%-3s", "Z");
                }
            });
            thread.start();
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("%-3s","A");
            }

        }
    }
