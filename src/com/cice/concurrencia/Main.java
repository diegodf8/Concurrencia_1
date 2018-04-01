package com.cice.concurrencia;

public class Main {

    public static void main(String[] args) {

        //Metodo 1 creacion de threads
        Thread hilo = new HiloPropio();
        hilo.setPriority(Thread.MAX_PRIORITY);
        hilo.start();
        Thread hilo2 = new HiloNuevo();
        hilo.setPriority(Thread.MIN_PRIORITY);
        hilo2.start();

        //Metodo 2 creacion de threads
        Thread hilo3 = new Thread(new HijoPrestado());
        hilo3.setPriority(Thread.MIN_PRIORITY);
        hilo3.start();

        Thread hilo4 = new Thread(()-> {
            Long contador= 0L;
            while (true){
                contador+=5000;
                System.out.println(contador + ":Hilo lambda milisegundos");
                try{
                    Thread.sleep(5000L);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        );

        Thread hilo5 = new Thread(() ->{
            Thread.currentThread().setName("HiloDiego"); //Setear el nombre del hilo
            for (int i = 0; i<50 ; i++){
                System.out.println(Thread.currentThread().getName() + ":" + i); //Imprimir nombre de hilo
                try{
                    Thread.sleep(5000L);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            };
            }
        );
        hilo4.setPriority(Thread.NORM_PRIORITY);
        hilo5.setPriority(Thread.NORM_PRIORITY);
        hilo5.start();
        hilo4.start();
    }
}