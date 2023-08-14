package deTodoSA;

/**
 *
 * @author johan
 */
public class Producto implements Comparable<Producto>{
        private Integer codigo;
        private String descripcion;
        private Double precio;
        private Integer stock;
        private Categoria rubro;

    public Producto() {
    }

    public Producto(Integer codigo, String descripcion, Double precio, Integer stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto t) {
        if (codigo == t.getCodigo()) {
            return 0;
        } else if (codigo > t.getCodigo()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
