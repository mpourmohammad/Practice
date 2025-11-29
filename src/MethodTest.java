public class MethodTest {
    public static void main(String[] args) {
        String a = greetUser("test");
        System.out.println(a);
    }

    public static String greetUser(String name) {
        return "Hello, " + name + "!";
    }
}