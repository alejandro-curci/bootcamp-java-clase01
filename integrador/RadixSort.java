package integrador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort
{
    public static void radixSort(int []arr) {
        // convierto a String y agrego ceros donde corresponda
        String[] strArr = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(strArr, '0');
        int iteraciones = strArr[0].length(); // itero una vez por cada digito de las cadenas
        String digitos = "0123456789";
        // creo la lista que sufrira los pasos de ordenamiento
        List<String> ordenada = new ArrayList<>();
        for(String s : strArr) {
            ordenada.add(s);
        }
        for(int i=0; i<iteraciones; i++) {
            // el mapa contiene la lista correspondiente a cada digito
            Map<Integer, List<String>> mapa = new HashMap<>();
            for(int j=0; j<10; j++) {
                mapa.put(j, new ArrayList<String>());
            }
            // ubico cada elemento en la lista que le corresponde
            for(String s : ordenada) {
                int ubicacion = digitos.indexOf(s.charAt(iteraciones-1-i));
                mapa.get(ubicacion).add(s);
            }
            ordenada.clear(); // vacio la lista para llenarla con las sublistas
            for(int j=0; j<10; j++) {
                ordenada.addAll(mapa.get(j));  // lleno la lista luego de cada paso del algoritmo
            }
        }
        // copio los elementos ordenados en un Array de enteros
        for(int i=0; i<ordenada.size(); i++) {
            arr[i] = Integer.parseInt(ordenada.get(i));
        }
    }

    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};  // test 1
        int arr2[]={90, 1230, 2, 901819, 893, 12, 9021, 5}; // test 2
        int arr3[]={9023, 876, 98, 34, 6, 1}; // test 3
        radixSort(arr);
        radixSort(arr2);
        radixSort(arr3);
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
        System.out.println();
        for(int i=0; i<arr2.length;i++) {
            System.out.print(arr2[i]+(i<arr2.length-1?",":""));
        }
        System.out.println();
        for(int i=0; i<arr3.length;i++) {
            System.out.print(arr3[i]+(i<arr3.length-1?",":""));
        }
    }
}
