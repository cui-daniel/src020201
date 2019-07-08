package cn.org.snail.java.study.src020201;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IMobilePhone mp1 = new HuaweiMobilePhoneFactory().createMobilePhone();
        System.out.println("this is a "+mp1);
        IMobilePhone mp2 = new LenovoMobilePhoneFactory().createMobilePhone();
        System.out.println("this is a "+mp2);
    }
}
