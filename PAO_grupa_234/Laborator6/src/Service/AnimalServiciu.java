import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Model.Exceptii.ListaAnimaleGoalaException;
import Model.Animal;

public class AnimalServiciu {

    private List<Animal> animale = new ArrayList<>();

    public void adaugaAnimal(Animal animal) {
        Objects.requireNonNull(animal, ".");
        animale.add(animal);
    }

    public static boolean listaNuEsteGoala(List<Object> lista) {
        Objects.requireNonNull(lista, "Lista este nula.");
        if (lista.isEmpty()) {
            throw new ListaAnimaleGoalaException("Lista de animale este goala.");
        }
        return true;
    }

    public List<Animal> getAnimale() {
        return animale;
    }
}
