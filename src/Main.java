
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();

        acilservis.offer(new Hasta("Inanc Bey","Yanık"));
        acilservis.offer(new Hasta("Ahmet Bey","Baş Ağrısı"));
        acilservis.offer(new Hasta("Alper Bey","Apandist"));
        acilservis.offer(new Hasta("Utku Bey","Yanık"));
        acilservis.offer(new Hasta("Medet Bey","Yanık"));
        acilservis.offer(new Hasta("Mertcem Bey","Apadist"));

        int i = 1;

        while(acilservis.isEmpty() != true){
            System.out.println("***************************************");
            System.out.println(i + ".sırada");
            System.out.println(acilservis.poll());
            System.out.println("***************************************");
            i++;

        }


    }
}
