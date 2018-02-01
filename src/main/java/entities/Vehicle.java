package entities;

import javax.persistence.*;

@Entity
@Table(name="vehicle_table")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "vehicle_name")
    private String vehicleName;

    @ManyToOne
    @JoinColumn(name ="student_id",nullable = false)
    private Student student;

    public Vehicle(){

    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
