public class Zamowienie {
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;

    public Zamowienie() {
        this.maxRozmiar = 10;
        this.pozycje = new Pozycja[this.maxRozmiar];
    }

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        this.pozycje = new Pozycja[this.maxRozmiar];
    }

    public void dodajPozycje(Pozycja p) {
        if (ileDodanych < maxRozmiar) {
            pozycje[ileDodanych] = p;
            ileDodanych++;
        } else {
            throw new IllegalArgumentException("Ilosc pozycji za duza");
        }
    }

    public double obliczWartosc() {
        double calkowitaWartosc = 0;
        for (int i = 0; i < ileDodanych; i++) {
            calkowitaWartosc = calkowitaWartosc + pozycje[i].obliczWartosc();
        }
        return calkowitaWartosc;
    }

    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < ileDodanych; i++) {
//            stringBuilder.append(pozycje[i].toString());
//            stringBuilder.append("\n");
//        }
//        stringBuilder.append(String.format("Calkowita wartosc zamowienia: %s", obliczWartosc()));
//        return stringBuilder.toString();
//    }
    public String toString() {
        String result = "";
        for (int i = 0; i < ileDodanych; i++) {
            result = result + pozycje[i].toString() + "\n";
        }
        result = result + String.format("Calkowita wartosc zamowienia: %s", obliczWartosc());
        return result;
    }

}
