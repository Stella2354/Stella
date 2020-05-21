/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import Objetos.Cliente;

/**
 *
 * @author stella
 */
public class VideoClub {
    
   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Cliente cliente;
        cliente = new Cliente();
        
        cliente.setNombre("ruth");
        cliente.setApellido("Millicay");
        cliente.setDni(Integer.parseInt("40333182") );
        cliente.setDomicilio("vargas");
        cliente.setTelefono(Integer.parseInt("652288"));
        
        System.out.println("Clientes:");
        
        System.out.println("nombre = "+cliente.getNombre());
        System.out.println("apellido = "+cliente.getApellido());
        System.out.println("Dni = "+cliente.getDni());
        System.out.println("Domicilio = "+cliente.getDomicilio());
       System.out.println("Telefono = "+cliente.getTelefono());
    
}
}
