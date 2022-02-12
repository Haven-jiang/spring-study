import com.Haven.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student studentinfo = context.getBean("studentinfo", Student.class);
        System.out.println(studentinfo.toString());
    }
}
