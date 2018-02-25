package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public  static  void main(String args[]){

//        FileReader fileReader = new FileReader();
//        fileReader.readFile();

        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
        try {
            fileReaderWithoutHandling.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
