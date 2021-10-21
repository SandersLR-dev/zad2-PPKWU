package com.example.zad2ppkwu;

public class StringInterpreter {

    private String givenString;
    private Integer length=0;
    private Integer letter=0;
    private Integer lowerCase=0;
    private Integer upperCase=0;
    private Integer number=0;
    private Integer whiteSpace=0;
    private Integer specialChar=0;

    public StringInterpreter() {
    }

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
            }else if(text.charAt(i)==' ') {
                whiteSpace++;
            }else{
                specialChar++;
            }
        }

    }

    public String getGivenString() {
        return givenString;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getLetter() {
        return letter;
    }

    public Integer getLowerCase() {
        return lowerCase;
    }

    public Integer getUpperCase() {
        return upperCase;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getWhiteSpace() {
        return whiteSpace;
    }

    public Integer getSpecialChar() {
        return specialChar;
    }
}
