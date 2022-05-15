import com.nie.pojo.Student;
import com.nie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
/*
Student{
    name='聂',
    address=Address{address='浙江'},
    books=[春秋, 三国, 西游],
    hobby=[吃饭, 睡觉, 打游戏],
    card={
        身份证=340827200012096512,
        银行卡=111111111111111111},
    games=[lol, cf], wife='null',
        info={
        学号=1190113016,
        性别=男,
        password=222,
        username=111
        }
    }
*/

    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }

}
