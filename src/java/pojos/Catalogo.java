package pojos;

/**
 *
 * @author Jonatan
 */
public class Catalogo {
    private Integer idCatalogo;
    private String nombre;
    private Integer idTipo;
    private Integer orden;

    public Catalogo(Integer idCatalogo, String nombre, Integer idTipo, Integer orden) {
        this.idCatalogo = idCatalogo;
        this.nombre = nombre;
        this.idTipo = idTipo;
        this.orden = orden;
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

}
