package org.example;

public class Ev {
    private String bina_turu;
    private int oda_sayisi;
    private String isinma;
    private String konum;
    private int kira;

    public static final class EvBuilder {
        private String bina_turu;
        private int oda_sayisi;
        private String isinma;
        private String konum;
        private int kira;

        private EvBuilder() {
        }

        public static EvBuilder anEv() {
            return new EvBuilder();
        }

        public EvBuilder withBina_turu(String bina_turu) {
            this.bina_turu = bina_turu;
            return this;
        }

        public EvBuilder withOda_sayisi(int oda_sayisi) {
            this.oda_sayisi = oda_sayisi;
            return this;
        }

        public EvBuilder withIsinma(String isinma) {
            this.isinma = isinma;
            return this;
        }

        public EvBuilder withKonum(String konum) {
            this.konum = konum;
            return this;
        }

        public EvBuilder withKira(int kira) {
            this.kira = kira;
            return this;
        }

        public Ev build() {
            Ev ev = new Ev();
            ev.isinma = this.isinma;
            ev.konum = this.konum;
            ev.kira = this.kira;
            ev.bina_turu = this.bina_turu;
            ev.oda_sayisi = this.oda_sayisi;
            return ev;
        }
    }
    @Override
    public String toString(){
        return "Ev 1{" +
                "Bina Türü="+bina_turu+ '\''+
                ", Oda Sayısı="+oda_sayisi + '\'' +
                ", Isınma="+isinma+'\''+
                ", Konum="+konum+'\''+
                ", Kira="+kira+"TL"+
                '}';
    }
}
