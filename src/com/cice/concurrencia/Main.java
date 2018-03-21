package com.cice.concurrencia;

public class Main {

    public static void main(String[] args) {
        Thread hilo = new HiloPropio();
        hilo.run();
    }
}