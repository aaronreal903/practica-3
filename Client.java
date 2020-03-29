import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Hello stub = (Hello) registry.lookup("Hello"); 
		 String msg = "Hola, este es un mensaje de echo desde el cliente";
         // Calling the remote method using the obtained object 
         
		 String imprimir = stub.printMsg(msg); 
         
         System.out.println(imprimir); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}