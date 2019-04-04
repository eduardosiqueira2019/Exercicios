import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

    public static void main(String[] args) {

        List<Integer> arrayNumeros = new ArrayList<>(9);
        arrayNumeros.add(1);
        arrayNumeros.add(34);
        arrayNumeros.add(3);
        arrayNumeros.add(2);
        arrayNumeros.add(60);
        arrayNumeros.add(100);
        arrayNumeros.add(5);
        arrayNumeros.add(9);
        arrayNumeros.add(110);
        arrayNumeros.add(78);



        System.out.println(SomaArray(arrayNumeros));


    }

    private static Integer SomaArray (List<Integer> array){

        Integer total = 0;
        /* jeito 1 de fazer
        for(int i = 0; i< array.size() ; i++ ){
            total = total + array.get(i);
        }
        */

        // Jeito 2 de fazer
        for (int i : array){
            total = total + i;
        }

        return total;
    }

}
