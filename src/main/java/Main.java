import model.Auto;
import model.User;
import service.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = new User("Ricky", 31);
        userService.saveUser(user1);
        Auto ford = new Auto("Explorer", "blue");
        ford.setUser(user1);
        user1.addAuto(ford);
        Auto mazda = new Auto("m9", "orange");
        mazda.setUser(user1);
        user1.addAuto(mazda);
        userService.updateUser(user1);
    }
}
