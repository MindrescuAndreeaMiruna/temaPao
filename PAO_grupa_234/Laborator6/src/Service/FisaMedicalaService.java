package Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.time.ZoneId;

import Model.Exceptii.ListaVaccinuriGoalaException;
import Model.Exceptii.VaccinIntarziatExceptie;
import Model.Animal;
import Model.FisaMedicala;
import Model.Vaccin;

public class FisaMedicalaService {

    private FisaMedicala fisa;

    public FisaMedicalaService(FisaMedicala fisa) {
        this.fisa = fisa;
    }

    public void adaugareVaccin(Vaccin v) {
        if (fisa == null) {
            throw new NullPointerException("Fisa medicala este goala.");
        }
        fisa.adaugaVaccin(v);
    }

    public boolean verificareVaccin(Animal animal) {
        Objects.requireNonNull(animal.getFisaMedicala(), "Lista de vaccinuri este goala");
        List<Vaccin> vaccinuri = animal.getFisaMedicala().getVaccinuri();
        if (vaccinuri.isEmpty()) {
            throw new ListaVaccinuriGoalaException("Lista de vaccinuri este goala.");
        }
        Vaccin ultimulVaccin = vaccinuri.get(vaccinuri.size() - 1);
        int anCurent = LocalDate.now().getYear();
        int anVaccin = ultimulVaccin.getData().atStartOfDay(ZoneId.of("Europe/Bucharest")).toInstant().atZone(ZoneId.of("Europe/Paris")).getYear();
        if (anVaccin < anCurent) {
            throw new VaccinIntarziatExceptie("Vaccin intarziat.");
        }
        return true;
    }

}
