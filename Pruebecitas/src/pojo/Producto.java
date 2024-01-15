package pojo;

public class Producto {

    //Atributos

    private String nombre;
    private int id;
    private int seccion;
    private double precioUnitario;
    private boolean enVenta;

    //Constructor

    public Producto (String nombre, int id, int seccion, double precioUnitario, boolean enVenta) {

        this.nombre = nombre;
        this.id = id;
        this.seccion = seccion;
        this.precioUnitario = precioUnitario;
        this.enVenta = enVenta;
    }

    //Getters and Setters

    public String getNombre (){

        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public int getId () {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", id=" + id + ", seccion=" + seccion + ", precioUnitario=" + precioUnitario
                + ", enVenta=" + enVenta + "]";
    }
}
