import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class App {
    public static void main(String[] args) {
     //   BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");


       // Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
     //   Mentor mentor2 = (Mentor)container.getBean("partTimeMentor");

        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);
        Mentor mentor2 = container.getBean("partTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor2.createAccount();
    }
}
