public class Main {
    public static void main(String[] args) {


        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Informacja pojawi się za 3 sekundy");
                    Thread.sleep(3000);
                    System.out.println("tekst wypisany z klasy anonimowej i mojego thread1");
                } catch (InterruptedException e) {
                    System.out.println("Poszedl exception");
                }

            }
        };
        thread1.start();

        Thread thread2 = new Thread(new Czasoodmierzacz());
        thread2.start();

        Thread threadMarian = new Thread(new WatekWyscigowy("Wątek Marian - nr1"));
        threadMarian.start();
        Thread threadBogdan = new Thread(new WatekWyscigowy("Wątek Bogdan - nr2"));
        threadBogdan.start();


    }
}