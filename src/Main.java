public class Main {

    public static void main (String[] args) {

        User firstUser = new User();
        System.out.println(firstUser);

        User secondUser = new User("John", "pass123", "user@gm.com", 30);
        System.out.println(secondUser);

        UserService userService = new UserService();
        User user = userService.getUserByLogin("Robert");
        System.out.println("znalazlem user'a: " + user.login + " " + user.age);


    }
}
