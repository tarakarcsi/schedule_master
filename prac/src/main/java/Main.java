public class Main {
    public static void main(String[] args) {
        int i = 10;
        doIt(i);
        System.out.println(i);

        User u = new User("Joe", 12);
        doIt(u);
        System.out.println(u);

        doIt2(u);
        System.out.println(u);
    }

    private static void doIt(int x) {
        x = 42;
    }

    private static void doIt(User k) {
        k = new User("jane", 99);
    }

    private static void doIt2(User k) {
        k.name = "Jane";
        k.age = 99;
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}