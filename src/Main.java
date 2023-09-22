/* Crear  una Bodega, se tendrá que crear una:
clase Artículos: Atributos(id,nombre, codigoBarras, precio, existencia),clase Principal donde se despliega un menú con las siguientes opciones:
1-Agregar nuevo artículo
2-Editar datos de un articulo
3-Buscar un articulo por código de barras
4-Eliminar un articulo
5-Buscar artículos por nombre
6-Mostrar una lista de artículos disponibles
7-Buscar por id */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Articulos> bodega = new ArrayList<>();
        Scanner opciones = new Scanner(System.in);
        /*System.out.println("Elija una opcion: \n1) Agregar articulo \n2) Editar articulo \n3) Salir");
        int opcion = opciones.nextInt();*/
        int opcion;
        do {
            System.out.println("Hola soy daniela" +
                    "Elija una opcion: " +
                    "\n1) Agregar articulo " +
                    "\n2) Editar articulo " +
                    "\n3) Buscar un artículo por código de barras " +
                    "\n4) Salir");
            opcion = opciones.nextInt();
            if (opcion == 1){
                bodega = agregarNuevoArticulo(bodega);
                System.out.println(bodega);
            } else if (opcion == 2) {
                bodega = editarArticulos(bodega);
                System.out.println(bodega);
            } else if (opcion == 3) {
               bodega = buscarCB(bodega);
               System.out.println(bodega);
            } else {
                break;
            }
        }while (opcion > 0 && opcion < 3);
    }

    private static List<Articulos> buscarCB(List<Articulos> bodega) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código de barras: ");
        String CB = entrada.nextLine();

        for (Articulos articulo : bodega) {
            if (articulo.getCodigoBarras().equals(CB)){
                System.out.println(articulo);
            }

        }
        return bodega;
    }


    private static List<Articulos> editarArticulos(List<Articulos> bodega) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese ID del articulo que desea editar: ");
        String idBuscado = entrada.nextLine();

        for (Articulos articulo : bodega) {
            if (articulo.getId().equals(idBuscado)) {
                System.out.println("Desea editar el nombre? \n1)Si 2)No");
                int editname = entrada.nextInt();
                entrada.nextLine();
                if (editname == 1){
                    System.out.println("Ingrese el nombre nuevo: ");
                    String nuevoNombre = entrada.nextLine();
                    articulo.setNombre(nuevoNombre);
                } else {
                    System.out.println("Desea editar el precio? \n1)Si 2)No");
                    int editPrice = entrada.nextInt();
                    entrada.nextLine();
                    if (editPrice == 1){
                        System.out.println("Ingrese precio nuevo: ");
                        double nuevoPrecio = entrada.nextDouble();
                        articulo.setPrecio(nuevoPrecio);
                    } else {
                        System.out.println("Desea editar la cantidad en existencia? \n1)Si 2)No");
                        int editExistencia = entrada.nextInt();
                        entrada.nextLine();
                        if (editExistencia == 1){
                            System.out.println("Ingrese la nueva cantidad en existencia: ");
                            int nuevaExistencia = entrada.nextInt();
                            entrada.nextLine();
                            articulo.setExistencia(nuevaExistencia);
                        } else {
                            System.out.println("Desea editar el codigo de barras? \n1)Si 2)No");
                            int editCB = entrada.nextInt();
                            entrada.nextLine();
                            if (editCB == 1){
                                System.out.println("Ingrese el nuevo código de barras: ");
                                int nuevoCB = entrada.nextInt();
                                entrada.nextLine();
                                articulo.setCodigoBarras(String.valueOf(nuevoCB));
                            } else {
                                System.out.println("No se ha editado el articulo");
                            }
                        }
                    }
                }
                break;
            } else {
                System.out.println("No se encontró ningún objeto con el ID " + idBuscado);
            }

        /*for (Articulos artic : bodega) {
            System.out.println(artic);
        }*/
        }
            return bodega;
    }

        private static List<Articulos> agregarNuevoArticulo(List<Articulos> bodega) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantos articulos desea agregar?");
            int cantidad = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cantidad; i++) {
                Articulos arti = new Articulos();
                System.out.println("Ingrese ID: ");
                arti.setId(sc.nextLine());
                System.out.println("Ingrese nombre: ");
                arti.setNombre(sc.nextLine());
                System.out.println("Ingrese codigo de barras: ");
                arti.setCodigoBarras(sc.nextLine());
                System.out.println("Ingrese precio: ");
                arti.setPrecio(sc.nextDouble());
                System.out.println("Ingrese existencia: ");
                arti.setExistencia(sc.nextInt());
                sc.nextLine();

                bodega.add(arti);
            }

            return bodega;
        }

}