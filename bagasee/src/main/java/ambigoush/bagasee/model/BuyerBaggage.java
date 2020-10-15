package ambigoush.bagasee.model;


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

public class BuyerBaggage {
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


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roleSet= new HashSet<>();


}
