package com.gustavo.readerenconding;

import java.io.IOException;
import org.mozilla.universalchardet.UniversalDetector;

/**
 *
 * @author gustavo
 */
public class GetTheEncode {

    public static String getTheEncode(String fileUrl) throws IOException {
        byte[] buf = new byte[4096];
        java.io.InputStream fis = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(fileUrl));

        // (1)
        UniversalDetector detector = new UniversalDetector();

        // (2)
        int nread;
        while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
            detector.handleData(buf, 0, nread);
        }
        // (3)
        detector.dataEnd();

        // (4)
        String encoding = detector.getDetectedCharset();
        if (encoding != null) {
            System.out.println("Detected encoding = " + encoding);
            return encoding;
        } else {
            System.out.println("No encoding detected.");
            return null;
        }
    }
    
}
