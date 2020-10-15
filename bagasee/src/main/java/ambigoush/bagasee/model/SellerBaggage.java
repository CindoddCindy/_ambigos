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
        private  Long seller_baggage_id;

        @NotBlank
        @Size(max =40)
        private  String seller_baggage_name;

        @NaturalId
        @NotBlank
        @Size(max = 40)
        @Email
        private  String seller_baggage_email;

        @NotBlank
        @Size(max = 15)
        private Long seller_baggage_phone_number;

        @NotBlank
        @Size(max = 100)
        private String seller_baggage_password;


        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
        private Set<Role> roleSet= new HashSet<>();

        public SellerBaggage(){

        }

        public SellerBaggage(Long seller_baggage_id, @NotBlank @Size(max = 40) String seller_baggage_name, @NotBlank @Size(max = 40) String seller_baggage_email, @NotBlank @Size(max = 15) Long seller_baggage_phone_number, @NotBlank @Size(max = 100) String seller_baggage_password, Set<Role> roleSet) {
                this.seller_baggage_id = seller_baggage_id;
                this.seller_baggage_name = seller_baggage_name;
                this.seller_baggage_email = seller_baggage_email;
                this.seller_baggage_phone_number = seller_baggage_phone_number;
                this.seller_baggage_password = seller_baggage_password;
                this.roleSet = roleSet;
        }

        public Long getSeller_baggage_id() {
                return seller_baggage_id;
        }

        public void setSeller_baggage_id(Long seller_baggage_id) {
                this.seller_baggage_id = seller_baggage_id;
        }

        public String getSeller_baggage_name() {
                return seller_baggage_name;
        }

        public void setSeller_baggage_name(String seller_baggage_name) {
                this.seller_baggage_name = seller_baggage_name;
        }

        public String getSeller_baggage_email() {
                return seller_baggage_email;
        }

        public void setSeller_baggage_email(String seller_baggage_email) {
                this.seller_baggage_email = seller_baggage_email;
        }

        public Long getSeller_baggage_phone_number() {
                return seller_baggage_phone_number;
        }

        public void setSeller_baggage_phone_number(Long seller_baggage_phone_number) {
                this.seller_baggage_phone_number = seller_baggage_phone_number;
        }

        public String getSeller_baggage_password() {
                return seller_baggage_password;
        }

        public void setSeller_baggage_password(String seller_baggage_password) {
                this.seller_baggage_password = seller_baggage_password;
        }

        public Set<Role> getRoleSet() {
                return roleSet;
        }

        public void setRoleSet(Set<Role> roleSet) {
                this.roleSet = roleSet;
        }

}
