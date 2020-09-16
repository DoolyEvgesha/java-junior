package demo.parallelism;

public class ParallelDemo {
    public static void main(String[] args) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Thread-1");
                }
            }
        }); //NEW

        thread.start(); // -> run
        while (true) {
            System.out.println("main");
        }
    }
}

