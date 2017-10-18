import static java.lang.System.err;
import java.io.*;



public class Main {

    public static void main(String[] args) {

        try{
            PrintWriter out = new PrintWriter( "output.txt" );
            out.println(SecureHashAlgorithm256.convert("hgrt4"));
            out.close();
        }catch (Exception e){
            System.out.println("Got an exception! " + err);
        }
    }
}
