package ambigoush.bagasee.bagasee_jwt.model;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "seller_baggage_role")
public class SellerBaggageRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleUser roleUser;

    public SellerBaggageRole() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }
}
