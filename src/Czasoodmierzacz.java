import java.sql.SQLOutput;
import java.util.Scanner;

public class Czasoodmierzacz implements Runnable {

    @Override
    public void run() {
        int runTime = 0;
        boolean isRunning = true;
        try {
            while (isRunning) {
               System.out.println("czas dzialania programu to: " + runTime + " sekund");
               Thread.sleep(1000);
               runTime++;
               }
        } catch (InterruptedException e) {
            System.out.println("Zakończono działanie programu po " + runTime + " sekundach");
        } ;

    }
}
