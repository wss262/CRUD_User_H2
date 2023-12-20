package cl.bci.login.apirest.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    private Date modified;
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_login;
    private Integer isactive;

    @OneToMany(mappedBy = "userPhone")
    private List<Phones> phoneUser = new ArrayList<>();


    @PrePersist
    public void prePersist() {
        this.created = new Date();
        this.last_login=new Date();
    }

    public User() {

    }

    public User(UUID id, String name, String email, String password, List<Phones> phoneUser, Date created, Date modified, Date last_login, Integer isactive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneUser = phoneUser;
        this.created = created;
        this.modified = modified;
        this.last_login = last_login;
        this.isactive = isactive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public List<Phones> getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(List<Phones> phoneUser) {
        this.phoneUser = phoneUser;
    }
}
