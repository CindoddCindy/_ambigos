package ambigoush.bagasee.bagasee_jwt.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class BuyerPrincipal {

    private  Long buyer_baggage_id;

    private  String buyer_baggage_name;

    @JsonIgnore
    private  String buyer_baggage_email;

    private Long buyer_baggage_phone_number;

    @JsonIgnore
    private String buyer_baggage_password;

    private Collection<? extends GrantedAuthority> authorities;



    public Long getBuyer_baggage_id() {
        return buyer_baggage_id;
    }

    public BuyerPrincipal(Long buyer_baggage_id, String buyer_baggage_name, String buyer_baggage_email, Long buyer_baggage_phone_number, String buyer_baggage_password, Collection<? extends GrantedAuthority> authorities) {
        this.buyer_baggage_id = buyer_baggage_id;
        this.buyer_baggage_name = buyer_baggage_name;
        this.buyer_baggage_email = buyer_baggage_email;
        this.buyer_baggage_phone_number = buyer_baggage_phone_number;
        this.buyer_baggage_password = buyer_baggage_password;
        this.authorities = authorities;
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

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
