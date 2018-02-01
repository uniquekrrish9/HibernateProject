package services;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class StudentService {
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();

    public void saveStudent(Student student){
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    public void getAllData(){
        session.beginTransaction();
        Query query= session.createQuery("FROM Student");
        List<Student> listOfStudent = query.list();
       for (Student student: listOfStudent){
             System.out.println("ID:"+student.getId());
             System.out.println("Name:"+student.getName());
             System.out.println("Address"+student.getAddress());
         }
        session.getTransaction().commit();
//        session.close();
    }
    public void getStudentById(Integer id){
        session.beginTransaction();
        Student student = (Student) session.get(Student.class,id);
        System.out.println("ID:"+student.getId());
        System.out.println("Name:"+student.getName());
        System.out.println("Address"+student.getAddress());
        session.getTransaction().commit();
//        session.close();
    }
    public void updateByStudentId(Integer id){
        session.beginTransaction();
        Student student = (Student) session.get(Student.class,id);
        student.setName("Ram Thapa");
        session.save(student);
        session.getTransaction().commit();
//        session.close();
    }
    public void deleteByStudentId(Integer id){
        session.beginTransaction();
        Student student = (Student) session.get(Student.class,id);
        session.delete(student);
        session.getTransaction().commit();
//        session.close();
    }

}
