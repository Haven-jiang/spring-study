import com.haven.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user1 = (User) context.getBean("u2");
        User user2 = (User) context.getBean("user10086");
        System.out.println(user1);
        System.out.println(user2);
    }
}
