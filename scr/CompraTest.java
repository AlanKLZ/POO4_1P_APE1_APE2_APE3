import java.time.LocalDate;
import java.util.ArrayList;
public class CompraTest{
    public static void main(String[] args) {
        ArrayList<Compra> compras = new ArrayList<>();
        Compra c1 = new Compra(TipoCompra.ENTRADA, "M001", LocalDate.now(), 2, 100.0, "A001");
        Compra c2 = new Compra(TipoCompra.KIT, "M002", LocalDate.now(), 1, 50.0, "A002");
        compras.add(c1);
        compras.add(c2);
        
        //Titulo de las columnas del archivo txt
        ManejoArchivos.EscribirArchivo("scr/texts/compras.txt", "CódigoCompra|Tipo|CódigoReferencia|FechaCompra|Cantidad|ValorPagado|CódigoAficionado");
        for (Compra c : compras){
            System.out.println(c.toString());
            String linea = c.getCodigo() + "|" + c.getCodigoReferencia() + "|" + c.getTipoCompra() + "|" + c.getFechaCompra() + "|" + c.getCantidad() + "|" + c.getValorPagado() + "|" + c.getCodigoAficionado();
            
            //Ingreso de filas
            ManejoArchivos.EscribirArchivo("scr/texts/compras.txt", linea);
        } 
/*         Nota: Vaciar el archivo compras.txt 
        para que no se muestre informacion dubplicada,
        ya que el codigo de compra se genera automaticamente
        y se incrementa cada vez que se crea una nueva compra.    */    
    }
}
