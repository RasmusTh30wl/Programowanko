package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "file.txt";
        String s="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            int lastPos=0, pos=0, testPos=0;
            while(testPos!=-1) {
                while(testPos!=-1) {
                    if(testPos-lastPos<20)
                        pos=testPos;
                    else
                        break;
                    testPos=s.indexOf(" ",testPos+1);
                }
                fileWriter.write(s,lastPos,pos-lastPos);
                fileWriter.write("\n");
                lastPos=pos+1;
            }
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
