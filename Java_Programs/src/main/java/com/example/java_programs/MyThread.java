package com.example.java_programs;

public class MyThread extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                 System.out.println("Thread");
                Thread.sleep(1000);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }
    public static void main(String []args){

    //    System.out.println("Main Function");
         MyThread myThread = new MyThread();
         myThread.start();

    Nthread nthread = new Nthread();
    Thread thread = new Thread(nthread);
    thread.start();

    System.out.println(thread.getId());


    }

}
           // THREAD by runnable Interface                                   ////
  class Nthread implements Runnable{

               @Override
               public void run() {
                   System.out.println("This is a Runnable Interface example");

               }
           }


