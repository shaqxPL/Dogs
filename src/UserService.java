public class UserService {

    User[] users = {
            new User("Steve", "passw10", "Steve@gm.com", 35 ),
            new User("Jack", "passw11", "Jack@gm.com", 40 ),
            new User("Will", "passw12", "Will@gm.com", 45 ),
            new User("Johny", "passw13", "Johny@gm.com", 50 ),
            new User("Robert", "passw15", "Robert@gm.com", 55 ),
    };

    public UserService (){
    }

    public User getUserByLogin (String login){
        for(User user: users){

            boolean isLoginExist = user.login.equals(login);

            if (isLoginExist){
                return user;
            }
        }

        return null;
    }
}
