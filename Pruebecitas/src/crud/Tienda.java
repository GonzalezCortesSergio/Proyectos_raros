package crud;

import pojo.Producto;

public class Tienda {

    //Atributos

    private Producto[] listaProductos;
    private int numProductos;


    //Constructor

    public Tienda (Producto [] listaProductos, int numProductos) {

        this.listaProductos = listaProductos;
        this.numProductos = numProductos;
    }

    //Métodos

    public void agregarProducto (Producto p) {

        listaProductos[numProductos++] = p;
    }

    public void mostrarEnVenta () {

        for (int i = 0; i < numProductos ; i++) {

            if (listaProductos[i].isEnVenta()) {
                System.out.println(listaProductos[i]);
                System.out.println();

            }
        }
    }

    public Producto [] buscarNoEnVenta () {

        int i = 0;
        Producto[] listaNoEnVenta = new Producto[numProductos];
        while (i < numProductos) {

            if (!listaProductos[i].isEnVenta()) {
                 listaNoEnVenta[i] = listaProductos[i];
            }
            i++;
        }

        return listaNoEnVenta;
    }

    public void mostrarNoEnVenta (Producto [] listaNoEnVenta) {

        for (int i = 0; i < listaNoEnVenta.length; i++) {

            if (listaNoEnVenta[i] != null) {

                System.out.println(listaNoEnVenta[i]);
                System.out.println();
            }
        }
    }

    public Producto buscarPorId (int id) {

        int i = 0;
        boolean encontrado = false;

        while (i < numProductos && !encontrado) {

            if (listaProductos[i].getId() == id) {

                encontrado = true;
            }

            else {

                i++;
            }
        }

        if (encontrado) {

            return listaProductos[i];
        }

        else  {

            return null;
        }
    }
    public void descatalogar (int id) {

        buscarPorId(id).setEnVenta(false);
    }

    public void devolverAVenta (int id) {

        buscarPorId(id).setEnVenta(true);
    }


}
