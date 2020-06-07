package com.umcs.oop1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

	    FilesystemSpaceAnalyzer analyzer = new FilesystemSpaceAnalyzer(path);
	    while(true) {
	        path = scanner.next();
	        if(path.equals("exit"))
	            break;
	        analyzer.analyze(path);
        }
    }
}
