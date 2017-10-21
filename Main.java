import static java.lang.System.err;



public class Main
{

    public static String hashpass="AC57D590ABE6D12D9A8EB691DB5975DE3677CAC168BF41C60D70DE4641681BE5";
    public static String pass;
    private static void initialize()
    {
        SubintervalSet SS=new SubintervalSet(10000000,99999999,121);
        SS.start();
    }

    public static void main(String[] args)
    {
        try {

            initialize();
            Thread[] thread = new Thread[121];
            for (int i = 0; i < thread.length; i++) {
                thread[i] = new MyThread(i, IntervalsControl.mininterval[i], IntervalsControl.maxinterval[i]);
            }
            for (int i = 0; i < thread.length; i++) {
                thread[i].start();
            }

        }catch (Exception e){
            System.out.println("Got an exception! " + err);
        }
    }
}
