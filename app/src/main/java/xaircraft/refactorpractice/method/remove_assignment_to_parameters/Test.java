package xaircraft.refactorpractice.method.remove_assignment_to_parameters;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("北极之南");

        changeByParames(person);
        System.out.println("out changeByParames method person = [" + person + "]");

        Person person2 = new Person("北极之南");

        changeByObject(person2);
        System.out.println("out changeByObject method person = [" + person2 + "]");

    }

    public static void changeByParames(Person person) {
        person.setName("北极之北");
        System.out.println("in changeByParames method person = [" + person + "]");
    }

    public static void changeByObject(Person person) {
        person = new Person("北极之北");
        System.out.println("in changeByObject method person = [" + person + "]");
    }
}
