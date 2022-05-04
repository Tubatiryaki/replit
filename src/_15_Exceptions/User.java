package _15_Exceptions;

public class User {
    // 1- filedları id, username, password, active (boolean), signedIn (boolean)
    //olan User isimli bir pojo class create ediniz.

   private int id;
   private String userName;
   private String pasword;
   private boolean active;
   private boolean signedIn;

    public User() {

    }

    public User(int id, String userName, String pasword, boolean active, boolean signedIn) {
        this.id = id;
        this.userName = userName;
        this.pasword = pasword;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", pasword='" + pasword + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
