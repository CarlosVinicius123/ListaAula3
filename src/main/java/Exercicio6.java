import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numeroAleatorio, chute;

        numeroAleatorio = rand.nextInt(10) + 1;

        do {
            System.out.println("Numero que deseja chutar:");
            chute = entrada.nextInt();

            if (chute < numeroAleatorio) {
                System.out.println("Chute menor que o numero aleatorio");
            } else if (chute > numeroAleatorio){
                System.out.println("Chute maior que o numero aleatorio");
            }


        } while (chute != numeroAleatorio);

        System.out.println("Acertou o numero!");

        entrada.close();

    }

}
