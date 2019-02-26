public class Question11 {
    int counter = 0;

    public int method() {



        synchronized (this) {
            return counter++; //only one thread can access it at a time
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question10 q10 = new Question10();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        //synchronised block: exact value 40000 as required
        System.out.println(q10.counter);
    }
}