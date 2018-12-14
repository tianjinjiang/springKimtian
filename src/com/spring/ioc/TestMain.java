package spring.ioc;

public class TestMain {
    public static void main(String[] args) {
        spring.ioc.OneInterface oneInterface = new spring.ioc.OneInterfaceImpl();
        System.out.println(oneInterface.hello("333"));
    }
}
