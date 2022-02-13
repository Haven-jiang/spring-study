import com.Haven.pojo.Student;
import com.Haven.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("studentinfo", Student.class);
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User contextBean = context.getBean("user1", User.class);
        System.out.println(contextBean);
    }
}