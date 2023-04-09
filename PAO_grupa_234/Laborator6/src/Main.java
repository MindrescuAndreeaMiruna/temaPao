import java.time.LocalDate;

import Model.Animal;
import Model.Caine;
import Model.FisaMedicala;
import Model.Pisica;
import Model.Vaccin;
import Service.AnimalServiciu;
import Service.FisaMedicalaService;
import Model.Exceptii.ListaAnimaleGoalaException;

public class Main {
    public static void main(String[] args) {
        AnimalServiciu serviciuAnimale = new AnimalServiciu();

        // creare fisa medicala
        FisaMedicala fisaMedicala = new FisaMedicala("nume_medic");

        // adaugare vaccin la fisa medicala
        Vaccin vaccin1 = new Vaccin("Vaccin1, LocalDate.now().minusMonths(2));
        Vaccin vaccin2 = new Vaccin("Vaccin2", LocalDate.now().minusMonths(1));
        fisaMedicala.adaugaVaccin(vaccin1);
        fisaMedicala.adaugaVaccin(vaccin2);

        Caine caine = new Caine("Erika", "Cane Corso", fisaMedicala);

        Pisica pisica = new Pisica("Motanel", 3);

        serviciuAnimale.adaugaAnimale(caine);
        serviciuAnimale.adaugaAnimale(pisica);

        try {
            AnimalServiciu.listaNuEsteGoala(serviciuAnimale.getAnimale(List<Animal>));
            for (Animal animal : serviciuAnimale.getAnimale()) {
                System.out.println(animal);
            }
        } catch (ListaAnimaleGoalaException e) {
            System.out.println(e.getMessage());
        }

        FisaMedicalaService fisaMedicalaService = new FisaMedicalaService(caine.getFisaMedicala());
        try {
            if (fisaMedicalaService.verificareVaccin(caine)) {
                System.out.println("Cainele este vaccinat.");
            } else {
                System.out.println("Cainele nu este vaccinat.");
            }
        } catch (ListaVaccinuriGoalaException e) {
            System.out.println(e.getMessage());
        } catch (VaccinIntarziatExceptie e) {
            System.out.println(e.getMessage());
        }
    }
}
