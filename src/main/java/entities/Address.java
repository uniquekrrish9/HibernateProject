package entities;


import javax.persistence.*;

@Entity
@Table(name ="address_table")
public class Address {
    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    private String city;
    private String town;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;

    public Address(String pokhara, String nayabazara){

    }

    public Address( String city, String town,Student student) {

        this.city = city;
        this.town = town;
        this.student=student;

    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
