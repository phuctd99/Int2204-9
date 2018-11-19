package com.company;

public class FileException extends Exception{
    public FileException(){

    }
    public FileException(String s){
        super(s);
    }
    public FileException(String s, Throwable cause){
        super(s, cause);
    }
    public FileException(Throwable cause){
        super(cause);
    }

}
