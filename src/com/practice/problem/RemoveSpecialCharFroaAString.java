package com.practice.problem;

public class RemoveSpecialCharFroaAString {
    //String s="@HeySinamika%*";
    //OutPut="HeySinamika"


    public static void main(String[] args) {
        String s="@HeySinamika%*";
        int count=0;
        String OriginalString="";
        String SpecialChar="";
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))
            && !Character.isWhitespace(s.charAt(i))){
                count++;
                SpecialChar+=s.charAt(i);
            }
            else{
                OriginalString+=s.charAt(i);
            }
        }
        if(count==0){
            System.out.println("There is no special Characters");
        }
        System.out.println("Original String is "+OriginalString);
        System.out.println("Spcial Characters are "+SpecialChar);
    }
}
