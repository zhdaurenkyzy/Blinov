package com.company;

public class aTaskTwo {
    public static void main(String[] args) {
       StringBuilder stringBuilder = new StringBuilder("Hello world");
       StringBuilder stringBuilderSecond2 = new StringBuilder(stringBuilder);
       String[] list = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
       for (int i = 0; i < stringBuilder.length(); i++) {

           for(int j=0; j< list.length; j++){
                 if (stringBuilder.substring(i, i+1).equalsIgnoreCase(list[j])) {
                 stringBuilder.replace(i, i+1, (j+1)+" ");
                 }
           }

        }

        System.out.println(stringBuilderSecond);
        System.out.println(stringBuilder);
    }
}
