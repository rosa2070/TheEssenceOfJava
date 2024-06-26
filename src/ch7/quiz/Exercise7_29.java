package ch7.quiz;

public class Exercise7_29 {
    public static void main(String[] args) {
        final int VALUE = 10;

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    try {
                        Thread.sleep(1*1000);
                    } catch (InterruptedException e) {}

                    System.out.println(VALUE);
                }
            }
        });

        t.start();
        System.out.println("main() - 종료.");
    }
}
