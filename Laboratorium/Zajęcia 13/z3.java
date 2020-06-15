package com.company;

import java.io.FileReader;
import java.io.IOException;


abstract class AbstractBook{
    protected String path;
    public AbstractBook(String path){
        this.path=path;
    }
    abstract String page(int pageNumber) throws IOException;
}
class BookA4 extends AbstractBook{
    public BookA4(String path) {
        super(path);
    }

    String page(int pageNumber) throws IOException {
        String text=new String("");
        FileReader plik=new FileReader(path);
        int c, nr=0;
        int start=(pageNumber-1)*4972, stop=pageNumber*4972;
        while((c=plik.read())!=-1){
            if(nr==stop)
                break;
            if(nr>=start)
                text += (char) c;
            nr++;
        }
        return text;
    }
}
class BookB5 extends AbstractBook{
    public BookB5(String path) {
        super(path);
    }

    String page(int pageNumber) throws IOException {
        String text=new String("");
        FileReader plik=new FileReader(path);
        int c, nr=0;
        int start=(pageNumber-1)*3838, stop=pageNumber*3838;
        while((c=plik.read())!=-1){
            if(nr==stop)
                break;
            if(nr>=start)
                text += (char) c;
            nr++;
        }
        return text;
    }
}


public class Main {



    public static void main(String[] args) throws IOException {
        AbstractBook b=new BookA4("book.txt");
        System.out.println(b.page(1));
    }
}
