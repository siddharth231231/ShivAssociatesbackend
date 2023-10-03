package BackEndOfShivAssociates.BackEndOfShivAssociates.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int eid;

    String name;

    String email;

    String phone;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Enquiry(int eid, String name, String email, String phone) {
        this.eid = eid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Enquiry() {
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
