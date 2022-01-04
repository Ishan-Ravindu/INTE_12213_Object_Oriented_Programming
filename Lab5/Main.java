package Lab5;

import Lab5.auth.Login;

public class Main {
    public static void main(String args[]){

        Login login = new Login("ishan@gmail.com","123@ishan");
        System.out.println(login.signIn());
    }
}
