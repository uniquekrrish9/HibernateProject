package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Student_table")
public class Student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="Name")
    private String name;

    @Column(name="Address")
    private String address;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "student")
    Set<Vehicle> vehicles = new HashSet<Vehicle>(0);
    public Student(){

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
