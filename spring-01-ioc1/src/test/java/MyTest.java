import com.haven.dao.UserDao;
import com.haven.dao.UserDaoImpl;
import com.haven.dao.UserDaoMysqlImpl;
import com.haven.dao.UserDaoOracleImpl;
import com.haven.service.UserService;
import com.haven.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层, dao层他们不需要接触!
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserdao(new UserDaoOracleImpl());
        userService.getUser();

        //获取ApplicationContext: 拿到Spring的容器
        ApplicationContext new_dao = new ClassPathXmlApplicationContext("Beans.xml");
        UserService obj = (UserServiceImpl) new_dao.getBean("service");
        obj.getUser();
    }
}
//在之前的业务中,用户的需求可能会影响我们原来的代码,我们需要根据用户的需求去修改源代码!如果代码量十分大,修改一次代码的成本会十分昂贵!