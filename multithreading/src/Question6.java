import java.util.concurrent.*;

public class Question6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 1;
            }
        });
        executorService.shutdown();

        if (future.isDone()) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("Future not done yet");

        if (future.isCancelled())
            System.out.println("Task cancelled!");
    }
}