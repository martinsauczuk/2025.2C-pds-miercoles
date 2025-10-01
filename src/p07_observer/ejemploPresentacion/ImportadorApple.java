package p07_observer.ejemploPresentacion;

public class ImportadorApple {

    private float conversionUsd = 15000;

    public float precioEnArsDelUltimoIphone() {
        System.out.println("iPhone 17 (127GB) USD799");
        return 799f * conversionUsd * 0.2f;
    }

}
