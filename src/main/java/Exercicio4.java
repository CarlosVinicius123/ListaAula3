import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int QTDalunos;

        System.out.println("Digite a quantidade de alunos de C125:");
        QTDalunos = entrada.nextInt();

        switch(QTDalunos){

            case 10:
            case 20:
                System.out.println("A sala utilizada pode ser a I-15");
                break;
            case 30:
                System.out.println("A sala utilizada pode ser a I-22");
                break;
            default:
                System.out.println("Numero de alunos incorreto");
                break;
        }

    }

}
