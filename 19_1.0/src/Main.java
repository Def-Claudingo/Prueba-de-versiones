import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>(List.of(5,5,5));
        List<Integer> numeros2 = new ArrayList<>(List.of(10,10,10,10));
        List<Integer> numeros3 = new ArrayList<>();

        List<Double> uno = analizar(numeros1);

        leer(uno);
    }
    public static List<Double> analizar(List<Integer> lista){
        double total = 0;
        double mayor = 0;
        List<Double> retornar = new ArrayList<>();
        if (lista == null || lista.isEmpty()){
            System.out.println("\nNo se permiten listas vacias!\n");
            return new ArrayList<>();
        }
        for (Integer num : lista){
            if(num < 0){
                System.out.println("No se permiten numeros negativos");
                return new ArrayList<>();
            }
            else{
                total += num;
                if (num > mayor){
                    mayor = num;
                }
            }
        }
        double promedio = total / lista.size();

        retornar.add(promedio);
        retornar.add(total);
        retornar.add(mayor);
        return retornar;
    }
    public static void leer(List<Double> leer){
        for (Double num : leer){
            System.out.println(num);
        }
    }
}