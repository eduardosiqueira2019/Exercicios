import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int num1;
        int num2;


        System.out.println("Digite o primeiro valor: ");
        Scanner pegaDado = new Scanner(System.in);
        num1 = pegaDado.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = pegaDado.nextInt();

        System.out.println(numeroMenor(num1,num2));

    }

    public static boolean numeroMenor (int numero1,int numero2){
        return numero1 < numero2;
    }
}
