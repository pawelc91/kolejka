package com.sda.kolejka;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        KolejkaLista kolejka = new KolejkaLista();

        kolejka.add(8);
        kolejka.add(10);
        kolejka.add(12);

        System.out.println(kolejka);

        int poczatkek = kolejka.pop();
        System.out.println(poczatkek);

        System.out.println(kolejka);

        int piewszywKolejce = kolejka.push();
        System.out.println("Pierwszy zdjęty z kolejki: " + piewszywKolejce);
        System.out.println(kolejka);

        kolejka.add(14);
        kolejka.add(16);

        System.out.println(kolejka);


    }
}
