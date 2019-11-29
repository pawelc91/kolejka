package com.sda.kolejka;

public class KolejkaObj {

    Element pierwszy;
    Element ostatni;

    public KolejkaObj() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int liczba) {
        Element nowyElement = new Element(liczba);

        if (pierwszy == null)
            pierwszy = ostatni = nowyElement;
        else {
            ostatni.nastepny = nowyElement;
            ostatni = nowyElement;
        }

    }

    public int pop() {
        return 0;
    }

    public int push() {
        return 0;
    }

//    @Override
//    public String toString() {
//        String opis = null;
//
//        if (pierwszy != null) {
//
//            Element biezacyElement = pierwszy;
//
//            while (true) {
//                opis = opis + biezacyElement.value + " ";
//                System.out.println("Nastepny element bedzie : "+biezacyElement.nastepny);
//
//                if (biezacyElement.nastepny == null) break;
//            }
//            return opis;
//
//        } else
//        return "Kolejka jest pusta";

    public void wypisz() {
        System.out.println(pierwszy.value);
        System.out.println(pierwszy.nastepny.value);
        System.out.println(pierwszy.nastepny.nastepny.value);
        System.out.println(pierwszy.nastepny.nastepny.nastepny);

    }
}