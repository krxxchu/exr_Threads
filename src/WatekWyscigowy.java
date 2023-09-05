public class WatekWyscigowy implements Runnable {

    private String nazwaWatku;

    public WatekWyscigowy (String nazwaWatku){
        this.nazwaWatku = nazwaWatku;
    }

    @Override
    public void run() {
        int licznik = 1;
        while (licznik <= 1000) {
            System.out.println("wykonalem sie " + licznik + " razy");
            licznik++;
        }
        System.out.println("Zakończyłem działanie! To ja, " + nazwaWatku);
    }
}
