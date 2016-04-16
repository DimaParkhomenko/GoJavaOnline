package test.module9;
import module9.*;
import org.junit.Assert;
import org.junit.Test;

public class CezarTest {

    @Test(timeout = 3000)
    public void testEncrypt() throws Exception {

        final String string = "Audio file";
        final int key = 2;

        CezarTestDrive cezarTestDrive = new CezarTestDrive();
        final String encryptString = cezarTestDrive.encrypt(string, key);

        Assert.assertEquals("Cwfkq hkng", encryptString);
    }

    @Test(timeout = 3000)
    public void testDeEncrypt() throws Exception {

        final String string = "Cwfkq hkng";
        final int key = 2;

        CezarTestDrive cezarTestDrive = new CezarTestDrive();
        final String decryptString = cezarTestDrive.decrypt(string, key);

        Assert.assertEquals("Audio file", decryptString);
    }
}
