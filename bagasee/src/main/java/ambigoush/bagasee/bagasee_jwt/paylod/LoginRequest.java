package ambigoush.bagasee.bagasee_jwt.paylod;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    private String userNameOrEmail;

    @NotBlank
    private  String userPassword;

    public String getUserNameOrEmail(){
        return  userNameOrEmail;
    }

    public  void setUserNameOrEmail(String userNameOrEmail){
        this.userNameOrEmail=userNameOrEmail;
    }

    public  String getUserPassword(){
        return  userPassword;
    }

    public  void setUserPassword(String userPassword){
        this.userPassword=userPassword;
    }
}
