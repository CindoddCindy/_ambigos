package ambigoush.bagasee.model;

import ambigoush.bagasee.model.audit.DateAudit;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "seller_baggage", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "seller_name"
        }),
        @UniqueConstraint(columnNames = {
                "seller_email"
        })
})


public class SellerBaggage extends DateAudit {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long seller_id;

        @NotBlank
        @Size(max =40)
        private  String seller_name;

        @NaturalId
        @NotBlank
        @Size(max = 40)
        @Email
        private  String seller_email;

        @NotBlank
        @Size(max = 15)
        private Long seller_phone_number;

        @NotBlank
        @Size(max = 100)
        private String seller_password;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
        private Set<Role> roleSet= new HashSet<>();

        public SellerBaggage(){

        }
        public SellerBaggage(String seller_name,String seller_email, Long seller_phone_number, String seller_password){
                this.seller_name=seller_name;
                this.seller_email=seller_email;
                this.seller_phone_number=seller_phone_number;
                this.seller_password=seller_password;
        }

        public Long getSeller_id(){
                return  seller_id;
        }

        public  void setSeller_id(Long seller_id){
                this.seller_id=seller_id;
        }

        public String getSeller_name(){
                return  seller_name;
        }

        public void setSeller_name(String seller_name){
                this.seller_name=seller_name;
        }

        public String getSeller_email(){
                return  seller_email;
        }

        public void getSeller_email(String seller_email){
                this.seller_email=seller_email;
        }

        public Long getSeller_phone_number(){
                return  seller_phone_number;
        }

        public  void setSeller_phone_number(Long phone_number){
                this.seller_phone_number=seller_phone_number;
        }

        public String getSeller_password(){
                return  seller_password;
        }

        public void setSeller_password(String seller_password){
                this.seller_password=seller_password;
        }

        public Set<Role> getRoleSet(){
                return  roleSet;
        }

        public  void setRoleSet(Set<Role>roleSet){
                this.roleSet=roleSet;
        }




}
