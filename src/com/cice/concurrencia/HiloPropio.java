package com.cice.concurrencia;

public class HiloPropio extends Thread {

    @Override
    public void run(){

        super.run();
        Long contador= 0L;
        while (true){
            System.out.println(++contador + ":Hilo segundos");
            try{
                Thread.sleep(5000L);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}