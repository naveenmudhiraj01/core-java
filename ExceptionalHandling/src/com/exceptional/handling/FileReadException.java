package com.exceptional.handling;

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;

class FileReadException {
    public static void main(String[] args) {


    	try {
    		File file=new File("Test.txt");
    		FileReader fr=new FileReader(file);
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Error! file was not opened becz of FileNOtFoundException! ");
    		
    	}
    }
}