public class Modem {
    private String name;
    private Line readLine;
    private Line writeLine;


    public Line getReadLine() {
        return readLine;
    }

    public Line getWriteLine() {
        return writeLine;
    }

    public Modem (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    private void readMessage(){
        System.out.println(name+" czyta wiadomość\nWiadomość to: "+readLine.read());
    }
    public void connect (Modem m){
        m.readLine=this.writeLine=new Line(m);
        m.writeLine=this.readLine=new Line(this);
    }

    public void writeMessage (String s){
        writeLine.write(s);
    }

    public void call(){
        readMessage();
    }
}
