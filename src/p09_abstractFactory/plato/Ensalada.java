package p09_abstractFactory.plato;

public class Ensalada implements Plato{

    @Override
    public int calorias() {
        return 100;
    }

    @Override
    public boolean aptoCeliaco() {
        return true;
    }
}
