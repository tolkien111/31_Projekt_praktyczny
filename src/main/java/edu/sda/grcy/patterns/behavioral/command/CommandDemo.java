package edu.sda.grcy.patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {

        MyFile myFile1 = new MyFile("File1.txt");
        String writeResult = myFile1.writeFile("aaa");
        System.out.println(writeResult);
        String updateResult = myFile1.updateFile("bbb");
        System.out.println(updateResult);

        krecha();

        OperationExecutor executor = new OperationExecutor();
        executor.executeOperation(new UpdateFileContentOperation(myFile1), "xxx");
        System.out.println(myFile1.getContent());
        krecha();

        MyFile file2 = new MyFile("MyFile2.txt");
        executor.executeOperation(new CreateFileContentOperation(file2), "Nowy plik, nowa zawartość");
        System.out.println(file2.getContent());
        krecha();
        executor.executeOperation(new UpdateFileContentOperation(file2), " i jeszcze dopisana zawartość");
        System.out.println(file2.getContent());
        krecha();
        executor.executeOperation(new CreateFileContentOperation(file2), "A teraz piszemy od zera");
        System.out.println(file2.getContent());
        krecha();

        System.out.println("Historia operacji na plikach"); // dorobić toString albo nowe metody do wyświetlania
        executor.getOperations()
                .forEach(System.out::println);

    }


    private static void krecha() {
        System.out.println("====================");
    }
}
