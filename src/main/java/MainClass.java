import entities.Address;
import entities.Plan;
import entities.Student;
import entities.Vehicle;
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

        Student student = new Student("sita","Pokhara");



        Plan plan = new Plan(2,"Premium");
        session.save(plan);

        student.setPlan(plan);
        session.save(student);

        session.getTransaction().commit();
        session.close();


//        Student student= new Student("Arun Thapa","Kathmandu");
//        StudentService studentService=new StudentService();


    }
}
