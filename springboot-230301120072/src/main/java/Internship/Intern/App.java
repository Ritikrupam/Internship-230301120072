package Internship.Intern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student1 = context.getBean(Student.class);
       System.out.println(student1);
    }
}
