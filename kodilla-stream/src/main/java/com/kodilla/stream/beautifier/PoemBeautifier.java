package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public void beautify(String text, PoemDecorator poemDecorator){
        String updatedText = poemDecorator.decorate(text);
        System.out.println(updatedText);
    }

    public void printNumber(int a){
        System.out.println(a);
    }

}
