package MagazinOnline;

public class Client {
    private String nume;
    private String username;
    private String password;

    public Client(String nume, String username, String password) {
        this.username = username;
        this.password = password;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
