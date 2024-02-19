package lesson8.AbstractClass.Ass10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



public class ZipAlgorithm extends CompressionAlgorithm {

    @Override
    void compress(String inputFile, String outputFile) {
        try (
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            ZipOutputStream zipOut = new ZipOutputStream(fos)) {

                ZipEntry entry = new ZipEntry (new File (inputFile).getName());
                zipOut.putNextEntry(entry);

                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zipOut.write(buffer, 0, length);
                }
    
                zipOut.closeEntry();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    