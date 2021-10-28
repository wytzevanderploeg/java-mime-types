package org.vertedge;

import org.junit.jupiter.api.Test;
import org.vertedge.util.MimeType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MimeTypeTest {

    @Test
    public void testMimeType() {
        String applicationZip = "application/zip";
        String zipExtension = ".zip";

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromType(applicationZip));

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromExtension(zipExtension));
    }

}
