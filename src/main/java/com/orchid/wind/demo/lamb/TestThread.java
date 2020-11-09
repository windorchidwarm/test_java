package com.orchid.wind.demo.lamb;

public class TestThread {

    static int count = 0;

    public static void main(String[] args) {
        Runnable runnable = () -> {
          for(int i=0; i<5; i++) {
              count ++;
              try {
                  Thread.sleep(1);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
        };

        for(int i=0; i<100; i++) {
            new Thread(runnable, "Thread-" + i).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
