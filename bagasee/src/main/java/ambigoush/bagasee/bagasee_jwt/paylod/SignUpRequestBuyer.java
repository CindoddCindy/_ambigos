package ambigoush.bagasee.bagasee_jwt.paylod;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequestBuyer {
    @NotBlank
    @Size(max =40)
    private  String buyer_baggage_name;


    @NotBlank
    @Size(max = 40)
    private  String buyer_baggage_email;

    @NotBlank
    @Size(max = 15)
    private Long buyer_baggage_phone_number;

    @NotBlank
    @Size(max = 100)
    private String buyer_baggage_password;


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
}
