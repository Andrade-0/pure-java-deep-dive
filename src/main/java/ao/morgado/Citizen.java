package ao.morgado;

public class Citizen {
    private String nif;
    private String username;
    private String password;
    private String province;

    public Citizen(String nif, String username, String password, String province) {
        this.nif = nif;
        this.username = username;
        this.password = password;
        this.province = province;
    }

    public String getNif() { return nif; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getProvince() { return this.province; }

    @Override
    public String toString() {
        return "Citizen{" +
                "nif='" + nif + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}