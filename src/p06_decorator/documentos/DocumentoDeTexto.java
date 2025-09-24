package p06_decorator.documentos;

public class DocumentoDeTexto implements Documento{

    private String titulo;
    private final int cantPaginas;
    private boolean abrochado;
    private boolean impreso;
    private boolean anillado;
    private boolean plastificado;

    public DocumentoDeTexto(String titulo, int cantPaginas) {
        this.titulo = titulo;
        this.cantPaginas = cantPaginas;
    }

    @Override
    public void imprimir() {
        impreso = true;
    }

    @Override
    public void abrochar() {
        abrochado = true;
    }

    @Override
    public void anillar() {
        anillado = true;
    }

    @Override
    public void plastificar() {
        plastificado = true;
    }

    @Override
    public int cantidadDePaginas() {
        return cantPaginas;
    }

    @Override
    public String toString() {
        return "CurriculumVitae{" +
                "cantPaginas=" + cantPaginas +
                ", abrochado=" + abrochado +
                ", impreso=" + impreso +
                ", anillado=" + anillado +
                ", plastificado=" + plastificado +
                '}';
    }
}
