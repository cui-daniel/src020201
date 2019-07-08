package cn.org.snail.java.study.src020201;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        IMobilePhone mp = new SimpleMobilePhoneFactory().createMobilePhone("simple");
        System.out.println("this is a "+mp);
    }
}
