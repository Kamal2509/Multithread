public class Multithread  extends Thread{
    public void run()
    {
        System.out.println("i m first thread");
    }
}
class  Test{
    public static void main(String[] args) {
        Multithread m=new Multithread();
        m.start();
    }
}
