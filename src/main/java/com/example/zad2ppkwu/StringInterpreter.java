package com.example.zad2ppkwu;

public class StringInterpreter {

    private String givenString;
    private Integer length;
    private Integer letter;
    private Integer lowerCase;
    private Integer upperCase;
    private Integer number;
    private Integer specialChar;

    public void analise(String text) {
        givenString = text;
        length = text.length();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                number++;
            }else if (Character.isLetter(text.charAt(i))) {
                letter++;
                if(Character.isLowerCase(text.charAt(i))){
                    lowerCase++;
                }else{
                    upperCase++;
                }
            }else{
                specialChar++;
            }
        }

    }


}
