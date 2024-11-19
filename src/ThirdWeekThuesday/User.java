package ThirdWeekThuesday;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;

    public User(String name) {
        this.name = name;

    }

   /* public User() {
    }*/

    public List<User> userList() {
        User user1 = new User("Liis");
        User user2 = new User("Mari");
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        return users;
    }
}
