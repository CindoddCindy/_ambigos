package ambigoush.bagasee.paylod;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequest {
    @NotBlank
    @Size(min=4, max =40)
    private String user_name;

    @NotBlank
    @Size( max = 40)
    @Email
    private String user_email;

    @NotBlank
    @Size(max=20)
    private Long user_phone_number;

    @NotBlank
    @Size(min=4, max=40)
    private  String user_password;


    @Size(min=1, max =10)
    private String user_status_penjual;

    @Size(min=1, max=10)
    private String user_status_pembeli;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Long getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(Long user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_status_penjual() {
        return user_status_penjual;
    }

    public void setUser_status_penjual(String user_status_penjual) {
        this.user_status_penjual = user_status_penjual;
    }

    public String getUser_status_pembeli() {
        return user_status_pembeli;
    }

    public void setUser_status_pembeli(String user_status_pembeli) {
        this.user_status_pembeli = user_status_pembeli;
    }
}
