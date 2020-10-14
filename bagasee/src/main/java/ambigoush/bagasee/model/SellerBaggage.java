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
        private  Long user_id;

        @NotBlank
        @Size(max =40)
        private  String user_name;

        @NaturalId
        @NotBlank
        @Size(max = 40)
        @Email
        private  String user_email;

        @NotBlank
        @Size(max = 15)
        private Long user_phone_number;

        @NotBlank
        @Size(max = 100)
        private String user_password;

        @NotBlank
        @Size(max = 20)
        private String user_status_penjual;

        @NotBlank
        @Size(max=20)
        private  String user_status_pembeli;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
        private Set<Role> roleSet= new HashSet<>();

        public SellerBaggage(){

        }
        public SellerBaggage(String user_name,String user_email, Long user_phone_number, String user_password, String user_status_penjual, String user_status_pembeli){
                this.user_name=user_name;
                this.user_email=user_email;
                this.user_phone_number=user_phone_number;
                this.user_password=user_password;
                this.user_status_penjual=user_status_penjual;
                this.user_status_pembeli=user_status_pembeli;
        }

        public Long getUser_id(){
                return  user_id;
        }

        public  void setUser_id(Long user_id){
                this.user_id=user_id;
        }

        public String getUser_name(){
                return  user_name;
        }

        public void setUser_name(String user_name){
                this.user_name=user_name;
        }

        public String getUser_email(){
                return  user_email;
        }

        public void getUser_email(String user_email){
                this.user_email=user_email;
        }

        public Long getUser_phone_number(){
                return  user_phone_number;
        }

        public  void setUser_phone_number(Long user_number){
                this.user_phone_number=user_phone_number;
        }

        public String getUser_password(){
                return  user_password;
        }

        public void setUser_password(String user_password){
                this.user_password=user_password;
        }

        public String getUser_status_penjual(){
                return  user_status_penjual;
        }

        public  void setUser_status_penjual(String user_status_penjual){
                this.user_status_penjual=user_status_penjual;
        }

        public String getUser_status_pembeli(){
                return  user_status_pembeli;
        }

        public  void setUser_status_pembeli(String user_status_pembeli){
                this.user_status_pembeli=user_status_pembeli;
        }

        public Set<Role> getRoleSet(){
                return  roleSet;
        }

        public  void setRoleSet(Set<Role>roleSet){
                this.roleSet=roleSet;
        }




}
