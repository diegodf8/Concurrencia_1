package com.cice.concurrencia;

public class HijoPrestado implements Runnable {

    @Override
    public void run() {

        Long contador= 0L;
        while (true){
            contador+=5000;
            System.out.println(contador + ":Hijo prestado milisegundos");
            try{
                Thread.sleep(5000L);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
/*inner class
    public class prueba extends Thread{
        Runnable target;
        public prueba(){};
        public prueba(Runnable target){
            this.target = target;
        }

    @Override
    public void run() {
        super.run();
        target.run();
    }
}*/
}
