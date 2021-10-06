package com.string;

public class ShuffleString {


    public static String restoreString(String s, int[] indices) {
        //Creamos un StringBuilder definiendo el tamaño a partir del String de entrada
        StringBuilder output = new StringBuilder(s);

        //Iteramos sobre el string de entrada
        for (int i = 0; i < s.length(); i++) {
            //Por cada iteración colocamos en el StringBuilder el contenido de los arrays de entrada < inidice , char >
            output.setCharAt(indices[i], s.charAt(i));
        }
        return output.toString();
    }

    public static void main(String[] args) {

        //Input example
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};


        //Validate correct input
        if (s.length() == indices.length) {
            String result = restoreString(s, indices);
            System.out.println(result);
        } else {
            System.out.println("No coinciden los tamaños de los índices y del string de entrada!");
        }


    }

    //EXTRA:


}
