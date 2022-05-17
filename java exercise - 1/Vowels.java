package com.ranajit;

public class Vowels {
    public static void main(String[] args) {
        Vowels ob = new Vowels();
        ob.CheckVowels();
    }
    void CheckVowels(){
        String name = "my name is ranajit";
        for(int i = 0;i < name.length();i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                System.out.println(name.charAt(i));
            }
        }
    }
}
