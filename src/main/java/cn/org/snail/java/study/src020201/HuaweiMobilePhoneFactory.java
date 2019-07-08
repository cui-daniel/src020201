package cn.org.snail.java.study.src020201;

public class HuaweiMobilePhoneFactory implements IMobilePhoneFactory{

    @Override
    public IMobilePhone createMobilePhone() {
        IMobilePhone result = new HuaweiMobilePhone();
        System.out.println("huawei mobile phone factory created a " + result);
        return result;
    }
}
