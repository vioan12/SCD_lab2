import java.io.PrintWriter;

import static java.lang.System.err;

/**
 * Created by ioan on 10/19/17.
 */
public class MyThread extends Thread {

    String message;

    private volatile boolean done = false;

    public MyThread(String m)
    {
        message = m;
    }

    public void run()
    {
            try {
                while (!done) {
                    PrintWriter out = new PrintWriter("output.txt");
                    out.println(message);
                    out.close();
                    setDone();
                }
            }catch (Exception e) {
                System.out.println("Got an exception! " + err);
            }
    }

    public void setDone()
    {
        done = true;
    }

}