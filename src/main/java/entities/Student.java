package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Cacheable
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

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "student_project",
//            joinColumns = {@JoinColumn(name = "student_id")},
//            inverseJoinColumns = {@JoinColumn(name = "project_id")}
//    )
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "student")
    Set<Vehicle> vehicles = new HashSet<>();

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
