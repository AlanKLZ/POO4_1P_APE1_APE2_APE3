import java.util.Scanner;
public class SistemaTest {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.cargarUsuarios();
        sistema.cargarPartidos();
        sistema.cargarKitCompra();
        ManejoArchivos.LimpiarArchivo("scr/texts/compras.txt");
        ManejoArchivos.EscribirArchivo("scr/texts/compras.txt", "CódigoCompra|CódigoReferencia|Tipo|FechaCompra|Cantidad|ValorPagado|CódigoAficionado");
        try(Scanner sc = new Scanner(System.in)){

        while (Sistema.sistemaActivo){
            sistema.iniciarSesion(sc);
            //ejemplo aficionado: cmendoza / mundial2026
            //ejemplo organizador lpereza / admin2026
            //ejemplo para probar correo alazhang / POO4_1P
            //andrverd|supervisor26
        }
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}
