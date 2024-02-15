package lesson7.exercise;

public abstract class ReadFileHandler {
    private String filename;

    public ReadFileHandler(String fileName){
        this.filename = fileName;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}