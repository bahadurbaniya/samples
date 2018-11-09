package au.com.baha.samples;

import au.com.heritage.loan.messaging.camel.processors.PasswordVerificationProcessor;
import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.wss4j.common.util.KeyUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import static org.junit.Assert.assertEquals;

public class PasswordValidationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PasswordValidationTest.class.getName());

    public void testPasswordValidation( String nonce, String created,  String incomingPassword) throws UnsupportedEncodingException, NoSuchAlgorithmException, WSSecurityException {

        // todo why these two don't match
      //  MessageDigest  digest = MessageDigest.getInstance("SHA-1");
       // assertEquals(digestBytes,digest.digest("C393F3DFA5CE8DE32018-01-07T22:58:56Z3434".getBytes(StandardCharsets.UTF_8)));
        }

    @Test
    public void testFewPasswords() throws UnsupportedEncodingException, NoSuchAlgorithmException, WSSecurityException {

    }

    @Test
    public void generateSHA1() throws Exception {
      MessageDigest  md = MessageDigest.getInstance("SHA-1");
        LOGGER.debug("sha1 of something {} " ,
                Base64.getEncoder().encodeToString(
                        md.digest("C393F3DFA5CE8DE32018-01-07T22:58:56Z343434".getBytes(StandardCharsets.UTF_8))));


    }
}
