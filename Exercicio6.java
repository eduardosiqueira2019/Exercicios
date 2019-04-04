import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {

    public static void main(String[] args) {

        List<Integer> arrayGeral = new ArrayList<>();

        arrayGeral.add(0);
        arrayGeral.add(1);
        arrayGeral.add(2);
        arrayGeral.add(3);
        arrayGeral.add(5);
        arrayGeral.add(6);
        arrayGeral.add(10);
        arrayGeral.add(20);


        System.out.println(soPares(arrayGeral));

    }

    private static List<Integer> soPares (List<Integer> listaArray){

        List<Integer> arrayPares = new ArrayList<>();

        for(Integer numero: listaArray){
            if(numero%2 == 0){
                arrayPares.add(numero);
            }
        }
        return arrayPares;
    }

    
}
