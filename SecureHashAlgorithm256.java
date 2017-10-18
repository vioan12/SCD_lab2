import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import static java.lang.System.err;

/**
 * Created by ioan on 10/18/17.
 */
public class SecureHashAlgorithm256
{

    private static String bytesToHex(byte[] hash)
    {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String convert(String stringvalue)
    {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(stringvalue.getBytes(StandardCharsets.UTF_8));
            return SecureHashAlgorithm256.bytesToHex(encodedhash).toUpperCase();
        }catch (Exception e){
            System.out.println("Got an exception! " + err);
            return "";
        }
    }

}
