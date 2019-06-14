package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFirstA {
    public static void main(String[] args) {

        String str = "Meet my family. There are five of us – my parents, my elder brother,
            + my baby sister and me. First, meet my mum and dad, Jane and Michael.";
        int k = 4;
        String[] words = str.split("[,.\\s]|\\s");
        for(String word: words){
            if(k<word.length()){
            word = word.replace(word.charAt(k-1), '*');
            }
        System.out.println(word);
        }
    }
}
