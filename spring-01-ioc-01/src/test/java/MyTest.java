import com.nie.dao.UserDaoImpl;
import com.nie.service.UserService;
import com.nie.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();


        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
        userService.getUser();

    }
}
