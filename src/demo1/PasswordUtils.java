package demo1;

import java.util.List;

/**
 * 6/13/14  4:35 PM
 * Created by JustinZhang.
 */
public class PasswordUtils {

    @UseCase(id = 47,description = "Passwords must contains at least one numeric")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "New password can not equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPassword,String password){

        return !prevPassword.contains(password);
    }
}
