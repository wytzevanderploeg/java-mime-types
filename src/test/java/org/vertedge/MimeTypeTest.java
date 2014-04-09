package org.vertedge;

import org.junit.Test;
import static org.junit.Assert.*;
import org.vertedge.util.MimeType;

public class MimeTypeTest {

    @Test
    public void testMimeType() {
        String applicationZip = "application/zip";
        String zipExtension = ".zip";

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromType(applicationZip));

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromExtension(zipExtension));
    }
}
