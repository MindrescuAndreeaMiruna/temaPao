package Model;

public class Caine implements Animal {

    private String nume;
    private String rasa;
    private FisaMedicala fisaMedicala;

    public Caine(String nume, String rasa, FisaMedicala fisaMedicala) {
        this.nume = nume;
        this.rasa = rasa;
        this.fisaMedicala = fisaMedicala;
    }

    @Override
    public String vorbeste() {
        return "Cainele " + this.nume + " latra";
    }

    @Override
    public FisaMedicala getFisaMedicala() {
        return fisaMedicala;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", fisaMedicala=" + fisaMedicala +
                '}';
    }

}
