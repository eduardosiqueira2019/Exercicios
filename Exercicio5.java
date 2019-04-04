import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

    public static void main(String[] args) {

        List<Integer> umArray = new ArrayList<>(9);

        umArray.add(10);
        umArray.add(3);
        umArray.add(5);
        umArray.add(6);
        umArray.add(208);
        umArray.add(102);
        umArray.add(101);
        umArray.add(2);
        umArray.add(67);
        umArray.add(99);

        System.out.println(somaPares(umArray));

    }

    private static Integer somaPares(List<Integer> arrayRecebido){

        Integer somatoria = 0;

        for(Integer i: arrayRecebido ){

            if(i%2 == 0) {
                somatoria = somatoria + i;
            }
        }
        return somatoria;
    }
}
