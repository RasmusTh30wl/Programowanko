package example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");
        String napisy="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Senectus et netus et malesuada. Commodo odio aenean sed adipiscing. Lorem mollis aliquam ut porttitor leo. Quis eleifend quam adipiscing vitae proin sagittis. Risus quis varius quam quisque id. Sit amet commodo nulla facilisi nullam vehicula ipsum a arcu. Nisl purus in mollis nunc sed id semper risus. Cras adipiscing enim eu turpis egestas pretium aenean. Natoque penatibus et magnis dis parturient montes nascetur ridiculus mus. Tempor nec feugiat nisl pretium fusce id. Ipsum faucibus vitae aliquet nec ullamcorper sit amet risus nullam. Id neque aliquam vestibulum morbi. Et malesuada fames ac turpis egestas sed. Vitae suscipit tellus mauris a diam maecenas sed enim. Aliquam purus sit amet luctus. Vitae sapien pellentesque habitant morbi tristique senectus et netus. Est ante in nibh mauris.";
        FileWriter fileWriter = new FileWriter(file);
        List<String> list = Arrays.asList(napisy.split(" "));
        String x="";
        for (int i = 0; i <list.size() ; i++) {
            if (i%19==0&&i!=0){
                x+=list.get(i);
                System.out.println(x);
                fileWriter.write(x);
                fileWriter.write("\n");
                fileWriter.flush();
                x="";
            }
            x+=list.get(i)+" ";
        }
        fileWriter.close();
    }
}
