
package examen;

import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
        Scanner ingresar=new Scanner (System.in);
        Scanner ingresar1=new Scanner (System.in);
         String nomLibro;
         String nomAut;
         String pais;
         int i=0;
         int j=0;
         int anio;
         boolean favo = false;
         int numLibro=0;
         Libro [] libros = new Libro[numLibro];
         String [] autor=new String[2];
       
        
        System.out.println("*****MENU PRINCIPAL*****");
        System.out.println("1._Ingresar Libro");
        System.out.println("2._Imprimir lista de favoritos");
        System.out.println("3._Contar libros de autor");
        System.out.println("4._SALIR");
        int opc;
        opc=ingresar.nextInt();
        switch(opc){
            case 1:
                if(numLibro>10){
                    System.out.println("Ya no existe espacio");}
                else {
                    
                    System.out.println("Ingrese el nombre del libro");
                
                nomLibro = ingresar1.nextLine();
                System.out.println("Ingrese el autor del libro");
                System.out.println("Ingrese el nombre del autor del libro");
                nomAut = ingresar1.next();
                System.out.println("Ingrese el pais del autor");
                pais = ingresar1.next();
                
                autor[j]=nomAut;
                autor[j+1]=pais;
                System.out.println("Ingrese el año de creacion del libro");
                anio= ingresar.nextInt();
                System.out.println("Ingrese si es favorito");
                favo=ingresar1.nextBoolean();
                libros[numLibro]=new Libro(nomLibro,autor,anio,favo);
                numLibro++;
                i++;
        }
                
                
            
            case 2:
                for(int a=0;a<libros.length;a++){
                    System.out.println(libros[a]);
                }
            case 3:
                System.out.println("Escoja el autor");
                for(int b=0;b<libros.length;b++){
                    
                    System.out.println(libros[b].getAutor());
                }
                
            case 4:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }}
        
    }
    

