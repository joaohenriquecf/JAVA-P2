public class Questao4 {
    public static void main(String[] args) {

        double salario = 1250;

        if (salario <= 900) {
            System.out.println("Isento");

        } else if (salario >= 901 || salario <= 1500) {
            System.out.println("desconto de 5%");

        } else if (salario >= 1501  || salario <= 2500) {
            System.out.println("Desconto de 10%");

        } else{
            System.out.println("desconto de 20%");
        }


    }
}
