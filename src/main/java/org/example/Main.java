package org.example;
public class Main {
    public static void main(String[] args) {
        Ev ev1=Ev.EvBuilder.anEv()
                .withBina_turu("Dublex")
                .withOda_sayisi(5)
                .withIsinma("klima")
                .withKonum("Sahile Yakın")
                .withKira(40000)
                .build();
        System.out.println(ev1.toString());
    }
}