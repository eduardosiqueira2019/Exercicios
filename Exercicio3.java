import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite um número para análise:");

        Scanner dadoDigitado = new Scanner(System.in);
        numero = dadoDigitado.nextInt();


        System.out.println(analisaNumero(numero));


    }

    public static boolean analisaNumero (int numero){
        return (numero%2 != 0 && numero > 10);
    }
}
