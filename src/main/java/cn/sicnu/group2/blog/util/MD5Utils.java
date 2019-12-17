package cn.sicnu.group2.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2019/12/17 21:18
 */
public class MD5Utils {

    public static String code(String str){
        try {
            MessageDigest md = MessageDigest.getInstance( "MD5" );
            md.update( str.getBytes() );
            byte[] bytesDig = md.digest();
            int i;
            StringBuffer stringBuffer = new StringBuffer( "" );
            for (int offset = 0;offset<bytesDig.length;offset++)
            {
                i = bytesDig[offset];
                if (i<0) {
                    i+=256;
                }
                if (i<16) {
                    stringBuffer.append( "0" );
                }
                stringBuffer.append( Integer.toHexString( i ) );
            }
            return stringBuffer.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

}
