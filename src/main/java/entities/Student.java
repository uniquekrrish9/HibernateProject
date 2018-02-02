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

    @ManyToOne
    @JoinColumn(name="plan_id",nullable = false)
    private Plan plan;

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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
