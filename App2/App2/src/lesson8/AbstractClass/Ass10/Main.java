package lesson8.AbstractClass.Ass10;

public class Main {
    public static void main(String[] args) {
        // Test the File Compression Utility

        // Specify input and output files
        String inputFile = "input.txt";
        String zipOutputFile = "output.zip";
        String gzipOutputFile = "output.gz";
        String lzmaOutputFile = "output.lzma";

        // Create instances of compression algorithms
        CompressionAlgorithm zipAlgorithm = new ZipAlgorithm();
        CompressionAlgorithm gzipAlgorithm = new GZipAlgorithm();
        CompressionAlgorithm lzmaAlgorithm = new LZMAAlgorithm();

        // Test Zip compression
        zipAlgorithm.compress(inputFile, zipOutputFile);
        System.out.println("File compressed using Zip algorithm.");

        // Test GZip compression
        gzipAlgorithm.compress(inputFile, gzipOutputFile);
        System.out.println("File compressed using GZip algorithm.");

        // Test LZMA compression (not implemented in this example)
        lzmaAlgorithm.compress(inputFile, lzmaOutputFile);
    }
}
