package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")

public class Project {

    @Id
    @Column(name = "project_id")
    private Integer id;

    @Column(name = "project_name")
    private String projectName;

    @ManyToMany(mappedBy = "projects")
    private Set<Student> students = new HashSet<>();

    public Project(Integer id, String projectName) {
        this.id = id;
        this.projectName = projectName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
