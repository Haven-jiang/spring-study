import com.Haven.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People bean = context.getBean("people", People.class);
        bean.getCat().shout();
        bean.getDog().shout();
    }
}
