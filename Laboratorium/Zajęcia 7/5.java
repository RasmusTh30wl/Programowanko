package com.company;
import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\User");
        File[] listOfFiles = folder.listFiles();
        int current, max=Integer.MIN_VALUE;
        String text=new String();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                if (listOfFiles[i].getName().startsWith("p_")) {
                    InputStream is = null;
                    try {
                        is = new FileInputStream(listOfFiles[i].getName());
                        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
                        String line1 = buf.readLine();
                        String line2 = buf.readLine();
                        current = Integer.parseInt(line2);
                        if (current > max) {
                            max = current;
                            text = line1;
                        }
                    }catch (Exception e){

                    }
                }
            }
        }
        System.out.println(text);
    }
}
