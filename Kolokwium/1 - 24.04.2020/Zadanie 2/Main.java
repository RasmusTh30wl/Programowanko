public class Main {
    public static void main(String[] args) {
        Security [] arr=new Security[5];
        arr[0]=new Stock(30,1);
        arr[1]=new Stock(20,2);
        arr[2]=new Debenture(50,3,10);
        arr[3]=new Debenture(60,4,20);
        arr[4]=new Stock(100,5);
        Wallet wallet=new Wallet(arr);
        //Wyświetlanie wartości przed stepem
//        System.out.println(wallet.returnValue());
        wallet.step();
        //Wyświetlanie wartości każdego papieru wartościowego dla sprawdzenia czy działa
//        for (Security s:arr) {
//            System.out.println("ID: "+s.getId()+"\nValue: "+s.getValue());
//        }
        System.out.println(wallet.returnValue());
    }
}
