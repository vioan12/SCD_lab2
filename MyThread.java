
import java.io.PrintWriter;

import static java.lang.System.err;
import static java.lang.System.in;
import static sun.text.normalizer.NormalizerImpl.convert;

/**
 * Created by ioan on 10/19/17.
 */

public class MyThread extends Thread
{

    private static boolean done = false;
    public static String pass;
    public static int nr_thread;
    private int nr_me,a,b,i;
    public MyThread(int value,int value2,int value3)
    {
        nr_me=value;
        a=value2;
        b=value3;
    }

    public void run()
    {
        if(done==false) {
            for (i = a; (i <= b) && (done == false); i++) {
                if (Main.hashpass.equals(SecureHashAlgorithm256.convert(""+i))) {
                    setDone();
                    pass=""+i;
                    nr_thread=nr_me;
                }
            }
        }
    }

    public void setDone()
    {
        done = true;
    }



}
