package membresiasGimnasios1;

public class Main {

    public static void main(String[] args) {
        TipoDeActividad cardio = new TipoDeActividad();
        TipoDeActividad pileta = new TipoDeActividad();
        TipoDeActividad deportes = new TipoDeActividad();



        Actividad natacion = new Actividad("Natacion", "Natacion", pileta);
        Actividad crossfit = new Actividad();
        Actividad basquet = new Actividad();

        Membresia unaMembresia = new Membresia();


        MembresiaFull full1 = new MembresiaFull();
        MembresiaCantidad pack6 = new MembresiaCantidad();
        MembresiaPorTipo soloPileta = new MembresiaPorTipo();

        full1.podesRealizar(natacion); // true
        pack6.podesRealizar(crossfit); // true
        soloPileta.podesRealizar(crossfit); // false



    }

}
