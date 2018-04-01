package com.cice.concurrencia;

public class HiloNuevo extends Thread {
    @Override
    public void run(){

        super.run();
        Long contador= 0L;
        while (true){
            contador+=5000;
            System.out.println(contador + ":Hilo Nuevo milisegundos");
            try{
                Thread.sleep(5000L);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
