package spring.ioc;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String string) {
        return string;
    }
}
