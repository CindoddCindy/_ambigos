package ambigoush.bagasee.bagasee_jwt.security;

import ambigoush.bagasee.bagasee_jwt.model.SellerBaggage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SellerPrincipal implements UserDetails {

    private  Long seller_baggage_id;

    private  String seller_baggage_name;


    @JsonIgnore
    private  String seller_baggage_email;

    private Long seller_baggage_phone_number;

    @JsonIgnore
    private String seller_baggage_password;

    private Collection<? extends GrantedAuthority> authorities;

    public SellerPrincipal(Long seller_baggage_id, String seller_baggage_name, String seller_baggage_email, Long seller_baggage_phone_number, String seller_baggage_password, Collection<? extends GrantedAuthority> authorities) {
        this.seller_baggage_id = seller_baggage_id;
        this.seller_baggage_name = seller_baggage_name;
        this.seller_baggage_email = seller_baggage_email;
        this.seller_baggage_phone_number = seller_baggage_phone_number;
        this.seller_baggage_password = seller_baggage_password;
        this.authorities = authorities;
    }

    public static SellerPrincipal create(SellerBaggage sellerBaggage) {
        List<GrantedAuthority> authorities = sellerBaggage.getRoleSet().stream().map(role ->
                new SimpleGrantedAuthority(role.getRoleName().toString())//ini di ganti
        ).collect(Collectors.toList());

        return new SellerPrincipal(
                sellerBaggage.getSeller_baggage_id(),
                sellerBaggage.getSeller_baggage_name(),
                sellerBaggage.getSeller_baggage_email(),
                sellerBaggage.getSeller_baggage_phone_number(),
                sellerBaggage.getSeller_baggage_password(),
                authorities
        );
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

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
