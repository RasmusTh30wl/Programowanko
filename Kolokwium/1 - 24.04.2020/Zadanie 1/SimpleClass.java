public class SimpleClass {
    private String str;
    public SimpleClass(String str){
        this.str=str;
    }
    
    
    //wersja bez StringBuildera
    public void SimpleMethod(char a, char b){
        String result="";
        for (String x:str.split(" ")) {
            if (x.toLowerCase().startsWith(String.valueOf(a))&&x.toLowerCase().endsWith(String.valueOf(b))){
                result+=x.charAt(0);
                for (int i = 0; i <x.length()-2 ; i++) {
                    result+='*';
                }
                result+=b;
            }
            else{
                result+=x;
            }
            result+=" ";

        }
        System.out.println(result);
    }

    public void SimpleMethod2(){
        String result="";
        for (String x:str.split(" ")) {
            result+=x.toUpperCase().charAt(0);
            if (x.length()>1) {
                result += x.substring(1, x.length() - 1);
                result += x.toUpperCase().charAt(x.length() - 1);
            }
            result += " ";
        }
        System.out.println(result);
    }

    
    //wersja z StringBuilderem
    public void metoda1(char a, char b) {
        StringBuilder builder1 = new StringBuilder();
        for (String s : str.split(" ")) {
            if (s.toLowerCase().startsWith(String.valueOf(a))&&s.toLowerCase().endsWith(String.valueOf(b))) {
                builder1.append(s.charAt(0));
                for (int i = 0; i < s.length() - 2; i++) {
                    builder1.append("*");
                }
                builder1.append(s.charAt(s.length() - 1));
            } else {
                builder1.append(s);
            }
            builder1.append(" ");
        }
        System.out.println(builder1);
    }

    public void metoda2() {
        StringBuilder builder1 = new StringBuilder();
        for (String s : str.split(" ")) {
            builder1.append(s.toUpperCase().charAt(0));
            if (s.length() > 1) {
                builder1.append(s.substring(1, s.length() - 1));
                builder1.append(s.toUpperCase().charAt(s.length() - 1));
            }
            builder1.append(" ");
        }
        System.out.println(builder1);
    }
}
