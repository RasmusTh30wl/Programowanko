package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //        //zadanie 1
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj napis!");
//        String s = scan.nextLine();
//        char min='z', max='a';
//
//        for(int i=0; i<s.length();i++) {
//            char c=s.charAt(i);
//            if('a' <= c && c <= 'z') {
//                if(c>max) max=c;
//                if(c<min) min=c;
//            }
//        }
//        System.out.println(min + " " + max);
//
//        //zadanie 2
//        System.out.println("Podaj trzy napisy!");
//        String edited = scan.nextLine();
//        String removed = scan.nextLine();
//        String add = scan.nextLine();
//        edited=edited.replace(removed, add);
//        System.out.println(edited);
//        //zadanie 3
//        String str = "Ala ma kota a kot ma Alę.";
//        StringTokenizer st = new StringTokenizer(str);
//        String word=new String();
//        String min=new String("zzzzz");
//        while (st.hasMoreElements()) {
//            word= (String) st.nextElement();
//            if(min.compareToIgnoreCase(word)>0) min=word;
//        }
//        System.out.println(min);
//        //zadanie 3a
//        String str = "Ala,ma,kota,kot,ma,Alę.";
//        StringTokenizer st = new StringTokenizer(str,",");
//        String word=new String();
//        String min=new String("zzzzz");
//        while (st.hasMoreElements()) {
//            word = (String) st.nextElement();
//            if(min.compareToIgnoreCase(word)>0) min = word;
//        }
//        System.out.println(min);
        //zadanie 4
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
