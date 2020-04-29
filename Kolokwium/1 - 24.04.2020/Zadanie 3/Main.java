public class Main {
    public static void main(String[] args) {
        Modem m1=new Modem("Modem 1");
        Modem m2=new Modem("Modem 2");
        m1.connect(m2);
        m1.writeMessage("Hejka");
        m1.writeMessage("Odpowiadaj szybko!");
        System.out.println(m2.getName()+" zapomniał ostatniej wiadomości, więc czyta ją jeszcze raz.\nWiadomość to: "+m2.getReadLine().read());
        m2.writeMessage("Nie będziesz mi mówił jak mam żyć!");
    }
}
