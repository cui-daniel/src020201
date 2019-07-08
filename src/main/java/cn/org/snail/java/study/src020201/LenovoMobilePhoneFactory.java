package cn.org.snail.java.study.src020201;

public class LenovoMobilePhoneFactory implements IMobilePhoneFactory{

    @Override
    public IMobilePhone createMobilePhone() {
        IMobilePhone result = new LenovoMobilePhone();
        System.out.println("lenovo mobile phone factory created a " + result);
        return result;
    }
}
