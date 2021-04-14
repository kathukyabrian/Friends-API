package tech.penta.friends.domain;

import javax.persistence.*;

@Entity
@Table(name="tbl_friends")
public class Friend {


    // object-oriented

    // Amos

    // -> methods, attributes

    //attributes -> name, gender
    // methods -> walk(), talk(), fight()

    // id, name, phoneNumber, email -> just use camelCase ->

    // ANNOTATIONS are key

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phoneNumber;

    private String email;

    // why do we have getters and setters  : AMOS [Encapsulation]

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


