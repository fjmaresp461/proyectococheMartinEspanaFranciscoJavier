
package coche;

/**
 *
 * @author Fran
 */
public class Main {
   
      public static void main(String[] args) {
        operativa_coches(300);
      }

    public static void operativa_coches(java.lang.Integer cantidad) {
        Coche Coche1;
        int stockActual;
        
        {
            
            Coche1 = new Coche("Opel",12000,500);
            try
            {
                System.out.println("Venta de Coches");
                Coche1.vender(600);
            } catch (Exception e)
            {
                System.out.print("Fallo al vender");
            }
            
            try
            {
                System.out.println("Compra de Coches");
                Coche1.comprar(0);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
            stockActual = Coche1.obtenerStock();
            System.out.println("El stock actual es"+ stockActual );
            
        }
    }
    //Prueba MartinEspañaFreanciscoJavier2223
}
    
