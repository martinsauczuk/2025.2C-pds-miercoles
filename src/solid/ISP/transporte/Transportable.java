package solid.ISP.transporte;

public interface Transportable {

    /**
     * Los productos como cerámicas
     * los pesamos
     */
    int pesoEnKilogramos();


    /**
     * Cuando transladamos contenedores
     * nos interesa el peso en toneladas.
     */
    int pesoEnToneladas();


    /**
     * Los tirantes de madera los facturamos por metro
     * porque ocupan mucho lugar
     */
    int medidaEnMetros();


    /**
     * En ocaciones transportamos vacunas
     */
    int fechaDeVencimiento();


    /**
     * Algunos productos requieren frio
     */
    int requiereRefrigeracion();
}
