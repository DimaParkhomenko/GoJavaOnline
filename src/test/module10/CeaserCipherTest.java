package test.module10;

import com.sun.prism.shader.Texture_Color_AlphaTest_Loader;
import module10.*;
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

    @Test(timeout = 3000)
    public void testFileUtil() throws Exception {

        FileUtil fileUtil = new FileUtil();
        try {
            fileUtil.write("TextTest.txt", "Hello Sidney.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fileUtil.read("TextTest.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}