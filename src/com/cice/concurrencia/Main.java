package com.cice.concurrencia;

public class Main {

    public static void main(String[] args) {
        Thread hilo = new HiloPropio();
        hilo.start();
        Thread hilo2 = new HiloNuevo();
        hilo2.start();
    }
}