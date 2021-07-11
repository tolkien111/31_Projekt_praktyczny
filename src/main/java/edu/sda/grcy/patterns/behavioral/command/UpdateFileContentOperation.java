package edu.sda.grcy.patterns.behavioral.command;

public class UpdateFileContentOperation implements  Operation{
    private  MyFile myFile;

    public UpdateFileContentOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        System.out.println(getClass().getSimpleName() + " called for" + myFile.getFileName());
        return myFile.updateFile(content);
    }
}
