public class SimpleClass {
    private String str;
    public SimpleClass(String str){
        this.str=str;
    }
    public void SimpleMethod(char a, char b){
        String tab[]=str.split(" ");
        String result="";
        for (String x:tab) {
            String z =x.charAt(0)+"";
            if (x.toLowerCase().startsWith(String.valueOf(a))&&x.toLowerCase().endsWith(String.valueOf(b))){
                for (int i = 0; i <x.length()-2 ; i++) {
                    z+='*';
                }
                z+=b;
                result+=z;
            }
            else{
                result+=x;
            }
            result+=" ";

        }
        System.out.println(result);
    }

    public void SimpleMethod2(){
        String tab[]=str.split(" ");
        String result="";
        for (String x:tab) {
            String z=x.toUpperCase().charAt(0)+"";
            if (x.length()>1) {
                for (int i = 1; i < x.length() - 1; i++) {
                    z += x.charAt(i);
                }
                z += x.toUpperCase().charAt(x.length() - 1);
            }
            result += z + " ";
        }
        System.out.println(result);
    }
}
