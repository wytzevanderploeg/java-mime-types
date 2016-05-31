This small Java library contains a set of enumerations for various mime-types and the respective file extension.
The MimeType can be determined by passing in a file extension.

Small example:
```java
        String applicationZip = "application/zip";
        String zipExtension = ".zip";

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromType(applicationZip));

        assertEquals(MimeType.APPLICATION_ZIP_ZIP, MimeType.fromExtension(zipExtension));
```
