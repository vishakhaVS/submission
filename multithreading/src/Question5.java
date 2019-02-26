import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question5{
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
                System.out.println("loop.");
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
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

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Sleep.");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();
        while (true) {
            if (executorService.isTerminated()) {
                System.out.println("ExecutorService Terminated Successfully.");
                break;
            }
        }

        System.out.println("{}");
    }
}