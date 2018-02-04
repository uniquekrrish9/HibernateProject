import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import services.StudentService;


import java.util.List;


public class MainClass {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Student student = session.get(Student.class,1);
        System.out.println("Name of id 1:"+student.getName());
        session.getTransaction().commit();
        session.close();

        Session session1 = sessionFactory.openSession();
        session1.beginTransaction();
        Student student1 = session1.get(Student.class,2);
        System.out.println("Name of id 2:"+student1.getName());
        session1.getTransaction().commit();
        session1.close();
    }
}
