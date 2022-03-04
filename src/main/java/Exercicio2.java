import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Partida1;
        int Partida2;
        int Partida3;

        System.out.println("Numero de zumbis mortos na Partida1:");
        Partida1 = entrada.nextInt();

        System.out.println("Numero de zumbis mortos na Partida2:");
        Partida2 = entrada.nextInt();

        System.out.println("Numero de zumbis mortos na Partida3:");
        Partida3 = entrada.nextInt();


        int Partidas = Partida1 + Partida2 + Partida3;

        System.out.println("Total de zumbis: " + Partidas);
        System.out.println("Media de zumbis mortos : " + Partidas/3);

    }



}
