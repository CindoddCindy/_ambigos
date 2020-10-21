package ambigoush.bagasee.bagasee_jwt.paylod;

import org.hibernate.annotations.NaturalId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequestSeller {


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


    //


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
}
