package p09_abstractFactory.plato;

public class HamburguesaCarneVacuna implements Plato{

    @Override
    public int calorias() {
        return 5443;
    }

    @Override
    public boolean aptoCeliaco() {
        return false;
    }
}
