package com.cice.concurrencia;

public class HiloPropio extends Thread {

    @Override
    public void run(){

        super.run();
        Long contador= 0L;
        while (true){
            System.out.println(++contador + ":segundos");
            try{
                Thread.sleep(1000L);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}