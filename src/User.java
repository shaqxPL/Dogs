public class User {

    String login;
    String password;
    String email;
    int age;


    public User (){
        login = "userLogin";
        password ="userPassword";
        email = "userEmail";
        age = 0;
    }

    public User(String login, String password, String email, int age){
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}









//User ma mieć login, password, email, age.