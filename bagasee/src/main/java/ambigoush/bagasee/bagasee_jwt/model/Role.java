package ambigoush.bagasee.bagasee_jwt.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleUser roleUser;

    public Role(){

    }

    public Role(RoleUser roleUser){
        this.roleUser = roleUser;
    }

    public Long getId(){
        return  id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public RoleUser getRoleName(){
        return roleUser;
    }
    public  void setRoleName(RoleUser roleUser){
        this.roleUser = roleUser;
    }
}
