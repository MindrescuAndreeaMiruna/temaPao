package Model;

public class Pisica implements Animal {

    private String nume;
    private int varsta;

    public Pisica(String nume) {
        this.nume = nume;
        this.varsta = 0;
    }

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String vorbeste() {
        return "Pisica " + this.nume + " miauna";
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return null;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

}
