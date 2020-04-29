package com.company;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "file2.txt";
        String lookedFor="ala";
        InputStream is =null;
        try {
         is= new FileInputStream(filePath);

        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();
        while(line != null){
            sb.append(line).append("\n");
            line = buf.readLine();
        }
        StringTokenizer textFromFile = new StringTokenizer(sb.toString());
        String word;
        int count=0;
        while (textFromFile.hasMoreElements()) {
            word= (String) textFromFile.nextElement();
            if(word.equals(lookedFor)) count++;
        }
        System.out.println(count);
        } catch (Exception e){
            if (is != null) {
                is.close();
            }
        }
    }
}
