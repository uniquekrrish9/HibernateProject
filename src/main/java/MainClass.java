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
//
        Student student = new Student("ram","pokhara");

        Vehicle vehicle = new Vehicle("Car");
        Vehicle vehicle1 = new Vehicle("Bike");

        vehicle.setStudent(student);
        vehicle1.setStudent(student);

        student.getVehicles().add(vehicle);
        student.getVehicles().add(vehicle1);
        session.save(student);

//        Student student=(Student)session.get(Student.class,1);
//        session.delete(student);

        session.getTransaction().commit();
        session.close();
    }
}
