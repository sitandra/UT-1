import homework3.tdd.User;
import homework3.tdd.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    @DisplayName("Проверка удаления всех пользователей, кроме администраторов")
    void killSimpleUsers() {
        UserRepository rep = new UserRepository();
        User user1 = new User("1", "", false);
        User user2 = new User("2", "", true);
        User user3 = new User("3", "", false);
        user1.authenticate("1", "");
        user2.authenticate("2", "");
        user3.authenticate("3", "");

        rep.addUser(user1);
        rep.addUser(user2);
        rep.addUser(user3);
        assertTrue(user1.isAuthenticate());
        assertTrue(user2.isAuthenticate());
        assertTrue(user3.isAuthenticate());

        rep.logOutSimpleUsers();
        assertFalse(user1.isAuthenticate());
        assertTrue(user2.isAuthenticate());
        assertFalse(user3.isAuthenticate());
    }
}
