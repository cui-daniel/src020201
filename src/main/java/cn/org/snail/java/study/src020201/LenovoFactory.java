package cn.org.snail.java.study.src020201;

public class LenovoFactory implements IFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        IMobilePhone result = new LenovoMobilePhone();
        System.out.println("lenovo factory created a " + result);
        return result;
    }

    @Override
    public IPersonalComputer createPersonalComputer() {
        IPersonalComputer result = new LenovoPersonalComputer();
        System.out.println("lenovo factory created a " + result);
        return result;
    }
}
