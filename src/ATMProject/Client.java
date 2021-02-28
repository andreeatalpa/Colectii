package ATMProject;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private String prenume;
    private String cnp;
    private String username;
    private String password;
    private List<ContCurent> contList = new ArrayList<ContCurent>();


    public Client(String nume, String prenume, String cnp, String username, String password) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<ContCurent> getContList() {
        return contList;
    }

    public void adaugaCont(ContCurent cont){
        contList.add(cont);
    }
}
