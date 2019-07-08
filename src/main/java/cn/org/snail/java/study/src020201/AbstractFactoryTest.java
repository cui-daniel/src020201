package cn.org.snail.java.study.src020201;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory factory1 = new HuaweiFactory();
        IMobilePhone mp1 = factory1.createMobilePhone();
        IPersonalComputer pc1 = factory1.createPersonalComputer();
        System.out.println("this is a " + mp1);
        System.out.println("this is a " + pc1);
        IFactory factory2 = new LenovoFactory();
        IMobilePhone mp2 = factory2.createMobilePhone();
        IPersonalComputer pc2 = factory2.createPersonalComputer();
        System.out.println("this is a " + mp2);
        System.out.println("this is a " + pc2);
    }
}
