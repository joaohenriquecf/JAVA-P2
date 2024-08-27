import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double x = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double y = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double z = entrada.nextDouble();

        media = (x + y + z) / 3;

        if (media >= 7) {
            System.out.println("Aluno Aprovado, Parabéns!!!");
        } else if(media >= 4 || media < 7) {
            System.out.println("Aluno está de final!!");
        } else {
            System.out.println("Reprovado!!");
        }


        }
    }

