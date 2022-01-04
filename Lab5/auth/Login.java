package Lab5.auth;

public class Login {
    private String email;
    private String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public boolean signIn() {
        UserList userList = new UserList();
        for (User i : userList.getUsers()) {
            if(this.email ==i.getEmail()&&this.password==i.getPassword()){
                return true;
            }
           }
        return false;
    }
    
}
