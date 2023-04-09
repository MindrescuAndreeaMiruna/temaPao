package Model;

import java.time.LocalDate;

public class Vaccin {
    private String denumireVaccin;
    private LocalDate data;

    public Vaccin(String denumireVaccin, LocalDate data) {
        this.denumireVaccin = denumireVaccin;
        this.data = data;
    }

    public String getDenumireVaccin() {
        return denumireVaccin;
    }

    public void setDenumireVaccin(String denumireVaccin) {
        this.denumireVaccin = denumireVaccin;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}