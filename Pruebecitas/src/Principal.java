import crud.Tienda;
import pojo.Producto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Variables

        String nombre, aux;
        int id = 1, seccion, opc, tam = 20;
        double precioUnitario;

        //Instanciar Scanner

        Scanner s = new Scanner(System.in);

        //Instanciar array

        Producto [] listaProductos = new Producto[tam];

        //Instanciar Tienda

        Tienda t = new Tienda (listaProductos, 0);

        //Inicio del programa

        System.out.println("#######                                  #     #                                            \n" +
                "   #    # ###### #    # #####    ##      ##   ##   ##   #    #  ####  #      # #####  ####  \n" +
                "   #    # #      ##   # #    #  #  #     # # # #  #  #  ##   # #    # #      #   #   #    # \n" +
                "   #    # #####  # #  # #    # #    #    #  #  # #    # # #  # #    # #      #   #   #    # \n" +
                "   #    # #      #  # # #    # ######    #     # ###### #  # # #    # #      #   #   #    # \n" +
                "   #    # #      #   ## #    # #    #    #     # #    # #   ## #    # #      #   #   #    # \n" +
                "   #    # ###### #    # #####  #    #    #     # #    # #    #  ####  ###### #   #    ####  ");

        do {

            System.out.println("""
                    ------------------------------------------------------------
                    Opcion 1:   Agregar producto
                    Opcion 2:   Ver productos en venta
                    Opcion 3:   Ver productos no en venta
                    Opcion 4:   Decatalogar productos
                    Opcion 5:   Volver a poner en venta
                    Opcion 0:   Salir
                    ------------------------------------------------------------
                    """);

            aux = s.nextLine();
            opc = Integer.parseInt(aux);

            switch (opc) {

                case 1:

                    System.out.println("Nombre del producto");
                    nombre = s.nextLine();

                    System.out.println("""
                                SECCION
                            Opcion 1:   Alimentacion
                            Opcion 2:   Aseo
                            Opcion 3:   Limpieza
                            """);
                    aux = s.nextLine();
                    seccion = Integer.parseInt(aux);

                    System.out.println("Precio unitario");
                    aux = s.nextLine();
                    precioUnitario = Double.parseDouble(aux);

                    t.agregarProducto(new Producto (nombre, id, seccion, precioUnitario, true));
                    id++;

                    break;

                case 2:

                    t.mostrarEnVenta();

                    break;

                case 3:

                    t.mostrarNoEnVenta(t.buscarNoEnVenta());

                    break;

                case 4:

                    System.out.println("Diga el id del producto que quiere" +
                            " descatalogar");
                    aux = s.nextLine();
                    id = Integer.parseInt(aux);

                    t.descatalogar(id);

                    System.out.println("Producto descatalogado correctamente");

                    break;

                case 5:

                    System.out.println("Diga el producto que quiere volver" +
                            " a poner en venta");

                    aux = s.nextLine();
                    id = Integer.parseInt(aux);

                    t.devolverAVenta(id);

                    System.out.println("Producto devuelto correctamente");

                    break;

                case 0:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("Opcion equivocada");

                    break;
            }
        }while (opc != 0);

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Gracias por utilizar el programa");
        System.out.println("--------------------------------");
    }
}
