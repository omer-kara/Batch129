package loginpageapp;

public class User {
    //3-üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
    private String name;
    private String username;
    private String email;
    private String password;
    //4-user objecsi olusturulurken ozellikler set edilsin
    public User(String name, String username, String email, String password){
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
