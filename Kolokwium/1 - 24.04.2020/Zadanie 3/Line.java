public class Line implements ReadDevice,WriteDevice{
    private String memory;
    private Modem m;

    public Line(Modem m) {
        this.m=m;
    }

    @Override
    public String read() {
        return memory;
    }

    @Override
    public void write(String s) {
        memory=s;
        System.out.println(m.getWriteLine().m.getName()+" wysyła wiadomość do "+m.getName()+"\n"+m.getWriteLine().m.getName()+" oczekuje odpowiedzi");
        m.call();
    }
}
