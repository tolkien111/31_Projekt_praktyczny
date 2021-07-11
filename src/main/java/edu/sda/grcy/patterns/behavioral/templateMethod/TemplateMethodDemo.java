package edu.sda.grcy.patterns.behavioral.templateMethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {

        NewsProvider provider1 = new EmailNewsProvider("aaa@bbb.ccc", "some news");
        provider1.provideNews();

        System.out.println("================");
        NewsProvider provider2 = new PhoneNewsProvider("+48xxxxxxxxx", "other news");
        provider2.provideNews();
    }
}
