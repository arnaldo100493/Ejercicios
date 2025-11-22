/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class ArraysExercises {

    private static int[] list;
    
    private static HashMap<Object, Object> hashMap = new HashMap<>();
    

    public static void exercise1() {
        int[] array = {1, 2, 2, 3, 6, 4, 4, 4, 9, 5, 6, 5, 9, 2};
        list = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (number(array[i])) {
                        list[i] = array[i];
                    }
                }
            }
            if (list[i] != 0) {
                System.out.println(list[i] + " se repite: " + count);
            }
        }
    }

    public static void exercise2() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(repeatedElement(a));
    }

    public static void exercise3() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        System.out.println(repeatedElement(a1, a2));
    }

    public static void exercise4() {
        int[] ar = {1, 0, 0, 4, 1, 3, 4, 0, 2, 1};
        Arrays.sort(ar); //Ordenamiento del arreglo
        int contador = 0;
        int aux = ar[0]; //En aux se almacena el primer valor del arreglo ordenado

        for (int i = 0; i < ar.length; i++) { //i = 0
            if (aux == ar[i]) {
                contador++; //contador = 2
            } else {
                System.out.println("El número " + aux + " se repite " + contador + " veces");
                contador = 1;
                aux = ar[i];
            }
        }
    }

    public static void exercise5() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        int pos = a.length - 1;

        System.out.println("El arreglo original [");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        System.out.println("]");

        for (int i = 0; i < b.length; i++) {
            b[i] = a[pos];
            pos--;

        }

        System.out.println("El arreglo inverso [");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }

        System.out.println("]");
    }

    public static void exercise6() {  //Ordenar Arreglo
        int aux;
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array1[j - 1] > array1[j]) {
                    aux = array1[j - 1];
                    array1[j - 1] = array1[j];
                    array1[j] = aux;
                }
            }
        }

        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array2[j - 1] > array2[j]) {
                    aux = array2[j - 1];
                    array2[j - 1] = array2[j];
                    array2[j] = aux;
                }
            }
        }
    }

    private static boolean number(int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                return false;
            }

        }
        return true;
    }

    public static boolean repeatedElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean repeatedElement(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
