package cn.org.snail.java.study.src020201;

public class HuaweiFactory implements IFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        IMobilePhone result = new HuaweiMobilePhone();
        System.out.println("huawei factory created a " + result);
        return result;
    }

    @Override
    public IPersonalComputer createPersonalComputer() {
        IPersonalComputer result = new HuaweiPersonalComputer();
        System.out.println("huawei factory created a " + result);
        return result;
    }
}
