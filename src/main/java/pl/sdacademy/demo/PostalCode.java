package pl.sdacademy.demo;

public class PostalCode {
    private String kod;
    private String miejscowosc;

    public PostalCode(String kod, String miejscowosc) {
        this.kod = kod;
        this.miejscowosc = miejscowosc;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }
}
