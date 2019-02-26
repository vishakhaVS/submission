import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Empty Thread");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread With Sleep.");

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



        executorService.submit(new Runnable() {
            @Override
            public void run() {
                if (executorService.isShutdown()) {
                    System.out.println("ExecutorService Shutdown Successfully.");
                }
            }
        });

        System.out.println("Main Thread Executed Successfully.");

        executorService.shutdown();
    }
}

