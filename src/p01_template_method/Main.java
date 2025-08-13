package p01_template_method;

public class Main {

    public static void main(String[] args) {
        CafeConsumoLocal unCafe = new CafeConsumoLocal();
        unCafe.preparar();

        CafeParaLlevar unCafeParaLlevar = new CafeParaLlevar();
        unCafeParaLlevar.preparar();
        unCafeParaLlevar.calentarExtra();

        System.out.println(unCafe);
        System.out.println(unCafeParaLlevar);

    }

}
