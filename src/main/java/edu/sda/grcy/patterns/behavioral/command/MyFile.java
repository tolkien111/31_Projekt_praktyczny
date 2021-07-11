package edu.sda.grcy.patterns.behavioral.command;
//klasyczne podejście
public class MyFile {
    private String fileName;
    private String content;

    public MyFile(String fileName) {
        this.fileName = fileName;
        content = "";
    }

    public String getFileName() {
        return fileName;
    }

    public String getContent() {
        return content;
    }

    public String writeFile(String content) {
        this.content = content;
        return "File " + fileName + " has new content: " + content;
    }

    public String updateFile(String content) {
        this.content += content;
        return "File " + fileName + " has updated content: " + this.content;
    }
}
