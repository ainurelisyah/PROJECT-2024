package lesson7.exercise;

public class CopyFile extends ReadFileHandler  {
    public CopyFile(String sourceFileName, String targetFileName) {
    super(sourceFileName, targetFileName);
    }
    public void copyFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getSourcefilename()));
                FileWriter writer = new FileWriter(super.getTargetfilename())) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        }
    }
}