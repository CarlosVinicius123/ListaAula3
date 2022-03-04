import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Npa, np3;


        System.out.println("Digite a Npa do Aluno:");
        Npa = entrada.nextInt();


        if(Npa>=60){

            System.out.println("Aluno Aprovado");

        }else{

            System.out.println("O aluno esta de np3:");

            System.out.println("Digite a Np3 do Aluno:");
            np3 = entrada.nextInt();

            if((np3 + Npa)/2 >= 50){

                System.out.println("Aluno Aprovado");

            }else{

                System.out.println("Aluno Reprovado");

            }

        }

    }
}
