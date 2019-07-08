package cn.org.snail.java.study.src020201;

public class SimpleMobilePhoneFactory {
    public IMobilePhone createMobilePhone(String name) {
        IMobilePhone result;
        if(name==null){
            result= null;
        }else if(name.equals("simple")) {
            result =new SimpleMobilePhone();
        }else if(name.equals("huawei")) {
            result =new HuaweiMobilePhone();
        }else if(name.equals("lenovo")) {
            result =new LenovoMobilePhone();
        }else{
            result= null;
        }
        if(result==null){
            System.out.println("simple mobile phone factory create mobile failed");
            return null;
        }
        System.out.println("simple mobile phone factory created a " + result);
        return result;
    }
}
