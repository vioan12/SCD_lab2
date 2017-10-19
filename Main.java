import static java.lang.System.err;



public class Main
{

    public static void main(String[] args)
    {
        try{
            Thread[] thread = new Thread[8];
            for (int i = 0; i < thread.length; i++) {
                thread[i] = new MyThread("Hello world from thread" + i);
            }
            for (int i = 0; i < thread.length; i++) {
                thread[i].start();
            }
        }catch (Exception e){
            System.out.println("Got an exception! " + err);
        }
    }
}
