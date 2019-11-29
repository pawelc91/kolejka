public class Kolejka {

    private Element pierwszy;
    private Element ostatni;

    public Kolejka() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int wartosc) {
        Element nowyElement = new Element(wartosc);
        if(isEmpty()){
            pierwszy = ostatni = nowyElement;
        } else {
            nowyElement.setPoprzedni(ostatni);
            ostatni.setNastepny(nowyElement);
            ostatni = nowyElement;

        }
    }

    public int pop(){
        return pierwszy.getWartosc();
    }

    public int push() {
        int zwracana = pierwszy.getWartosc();
        pierwszy = pierwszy.getNastepny();
        pierwszy.setPoprzedni(null);
        return zwracana;

    }

    public boolean find(int szukana) {
        Element indexElement = pierwszy;
        int index = 0;
        while (indexElement !=null) {
            if (szukana == indexElement.getWartosc()) {
                System.out.println("Wartość " + szukana + " została znaleziona na indeksie " + index);
                return true;
            } else {
                index++;
                indexElement = indexElement.getNastepny();
            }
        }
        System.out.println("niestety nie znalazłem wartości " + szukana);
        return false;
    }


    public void show() {
        Element indexElement = pierwszy;

        while (indexElement != null) {
            System.out.print(indexElement.getWartosc()+ " ");
            indexElement = indexElement.getNastepny();

        }

        System.out.println();

    }

    public boolean isEmpty(){
        if (ostatni == null) return true;
        else return false;
    }


}
