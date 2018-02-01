import entities.Address;
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
//        Address address = new Address("pokhara","nayabazara",student);
//        address.setStudent(address);

//        session.save(address);
        session.save(student);

        Vehicle vehicle = new Vehicle("Car");
        Vehicle vehicle1 = new Vehicle("Bike");

        vehicle.setStudent(student);
        vehicle1.setStudent(student);

        student.getVehicles().add(vehicle);
        student.getVehicles().add(vehicle1);

        session.save(vehicle);
        session.save(vehicle1);

        session.getTransaction().commit();
        session.close();


//        Student student= new Student("Arun Thapa","Kathmandu");
//        StudentService studentService=new StudentService();


    }
}
