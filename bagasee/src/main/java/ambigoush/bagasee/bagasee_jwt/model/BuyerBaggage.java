package ambigoush.bagasee.bagasee_jwt.model;


import ambigoush.bagasee.bagasee_jwt.model.audit.DateAudit;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "buyer_baggage", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "buyer_name"
        }),
        @UniqueConstraint(columnNames = {
                "buyer_email"
        })
})

public class BuyerBaggage extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long buyer_baggage_id;

    @NotBlank
    @Size(max =40)
    private  String buyer_baggage_name;

    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private  String buyer_baggage_email;

    @NotBlank
    @Size(max = 15)
    private Long buyer_baggage_phone_number;

    @NotBlank
    @Size(max = 100)
    private String buyer_baggage_password;

    public  BuyerBaggage(){

    }


    public BuyerBaggage(Long buyer_baggage_id, @NotBlank @Size(max = 40) String buyer_baggage_name, @NotBlank @Size(max = 40) @Email String buyer_baggage_email, @NotBlank @Size(max = 15) Long buyer_baggage_phone_number, @NotBlank @Size(max = 100) String buyer_baggage_password) {
        this.buyer_baggage_id = buyer_baggage_id;
        this.buyer_baggage_name = buyer_baggage_name;
        this.buyer_baggage_email = buyer_baggage_email;
        this.buyer_baggage_phone_number = buyer_baggage_phone_number;
        this.buyer_baggage_password = buyer_baggage_password;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id"))


    private Set<Role> roleSet= new HashSet<>();

    public Long getBuyer_baggage_id() {
        return buyer_baggage_id;
    }

    public void setBuyer_baggage_id(Long buyer_baggage_id) {
        this.buyer_baggage_id = buyer_baggage_id;
    }

    public String getBuyer_baggage_name() {
        return buyer_baggage_name;
    }

    public void setBuyer_baggage_name(String buyer_baggage_name) {
        this.buyer_baggage_name = buyer_baggage_name;
    }

    public String getBuyer_baggage_email() {
        return buyer_baggage_email;
    }

    public void setBuyer_baggage_email(String buyer_baggage_email) {
        this.buyer_baggage_email = buyer_baggage_email;
    }

    public Long getBuyer_baggage_phone_number() {
        return buyer_baggage_phone_number;
    }

    public void setBuyer_baggage_phone_number(Long buyer_baggage_phone_number) {
        this.buyer_baggage_phone_number = buyer_baggage_phone_number;
    }

    public String getBuyer_baggage_password() {
        return buyer_baggage_password;
    }

    public void setBuyer_baggage_password(String buyer_baggage_password) {
        this.buyer_baggage_password = buyer_baggage_password;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
