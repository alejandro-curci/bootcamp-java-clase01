package integrador;

import java.util.ArrayList;
import java.util.List;

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
            List<String> list0 = new ArrayList<>();
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            List<String> list7 = new ArrayList<>();
            List<String> list8 = new ArrayList<>();
            List<String> list9 = new ArrayList<>();
            // ubico cada elemento en la lista que le corresponde
            for(String s : ordenada) {
                int ubicacion = digitos.indexOf(s.charAt(iteraciones-1-i));
                switch(ubicacion) {
                    case 0:
                        list0.add(s);
                        break;
                    case 1:
                        list1.add(s);
                        break;
                    case 2:
                        list2.add(s);
                        break;
                    case 3:
                        list3.add(s);
                        break;
                    case 4:
                        list4.add(s);
                        break;
                    case 5:
                        list5.add(s);
                        break;
                    case 6:
                        list6.add(s);
                        break;
                    case 7:
                        list7.add(s);
                        break;
                    case 8:
                        list8.add(s);
                        break;
                    case 9:
                        list9.add(s);
                        break;
                    default:
                        break;
                }
            }
            ordenada.clear(); // vacio la lista para llenarla con las sublistas
            ordenada.addAll(list0);
            ordenada.addAll(list1);
            ordenada.addAll(list2);
            ordenada.addAll(list3);
            ordenada.addAll(list4);
            ordenada.addAll(list5);
            ordenada.addAll(list6);
            ordenada.addAll(list7);
            ordenada.addAll(list8);
            ordenada.addAll(list9);
        }
        // copio los elementos ordenados en un Array de enteros
        for(int i=0; i<ordenada.size(); i++) {
            arr[i] = Integer.parseInt(ordenada.get(i));
        }
    }

    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
