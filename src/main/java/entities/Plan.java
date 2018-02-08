package entities;

import javax.persistence.*;

@Entity
@Table(name="plan_table")
public class Plan {
    @Id

    private Integer id;

    @Column(name="plan_name")
    private String planName;

    public Plan() {
    }

    public Plan(Integer id,String planName) {
        this.id =id;
        this.planName = planName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getPlanName() {
//        return planName;
//    }
//
//    public void setPlanName(String planName) {
//        this.planName = planName;
//    }


}
