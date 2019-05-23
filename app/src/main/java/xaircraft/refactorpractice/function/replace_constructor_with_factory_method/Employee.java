package xaircraft.refactorpractice.function.replace_constructor_with_factory_method;

public class Employee {
    public static final int ENGINNER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;


    public static Employee create(int type) {
        switch (type) {
            case ENGINNER:
                return new Enginner();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                return null;
        }
    }

    public static Employee createByName(String name){
        try{
            return (Employee) Class.forName(name).newInstance();
        }catch(Exception e){
            throw new IllegalArgumentException(name + "name is  unavailable");
        }
    }
}
