package p09_abstractFactory.plato;

public class PorcionDeAsado implements Plato {

    @Override
    public int calorias() {
        return 6460;
    }

    @Override
    public boolean aptoCeliaco() {
        return true;
    }
}
