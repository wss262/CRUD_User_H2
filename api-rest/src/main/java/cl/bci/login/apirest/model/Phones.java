package cl.bci.login.apirest.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="phones")
public class Phones  {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPhone;
    private String number;
    private String citycode;
    private String countrycode;

    @ManyToOne
    private User userPhone;

    public Phones() {

    }

    public Phones(UUID idPhone, String number, String citycode, String countrycode, User userPhone) {
        this.idPhone = idPhone;
        this.number = number;
        this.citycode = citycode;
        this.countrycode = countrycode;
        this.userPhone = userPhone;
    }

    public UUID getId() {
        return idPhone;
    }

    public void setId(UUID idPhone) {
        this.idPhone = idPhone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public User getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(User userPhone) {
        this.userPhone = userPhone;
    }
}
