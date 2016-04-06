package test.module10;

import org.junit.Assert;
import org.junit.Test;

public class CeaserCipherTest {

    @Test(timeout = 3000)
    public void testEncrypt() throws Exception {

        final String string = "Hello Java!!!";
        final int key = 2;

        CeasarCipher ceasarCipher = new CeasarCipher();
        final String encryptString = ceasarCipher.encrypt(string, key);

        Assert.assertEquals("Jgnnq Lcxc!!!", encryptString);
    }

    @Test(timeout = 3000)
    public void testDeEncrypt() throws Exception {

        final String string = "Jgnnq Lcxc!!!";
        final int key = 2;

        CeasarCipher ceasarCipher = new CeasarCipher();
        final String decryptString = ceasarCipher.decrypt(string, key);

        Assert.assertEquals("Hello Java!!!", decryptString);
    }


}