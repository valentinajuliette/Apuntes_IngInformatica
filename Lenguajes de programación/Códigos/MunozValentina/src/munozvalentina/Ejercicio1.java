/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package munozvalentina;

/*
            EJERCICIO 1:
Realice un programa en Java que valide el ingreso de direcciones URL.
El programa debe mostrar un mensaje de error si la URL no está escrita correctamente
y solicitar nuevamente el ingreso de la dirección. Una URL está escrita correctamente cuando:
    a.	Comienza con http://
    b.	Termina con .cl , .com , .org o .net
    c.	El nombre de dominio tiene al menos 3 caracteres
    d.	No contiene los símbolos  ¿? ¡! “ # $ % & ( ) = @
 */

// Se importa la librería de utilidad de inputs del usuario
import java.util.Scanner;

// Se inicia la clase
public class Ejercicio1 {
    
    // Se inicia el cuerpo del código
    public static void main(String[] args) {
        
        // Se crea el objeto "Scanner"
        Scanner sc = new Scanner(System.in);

        // Se crean las variables
        String URL = new String();
        String inicio = "http://";
        String invalido = "La URL ingresada no es valida, por favor ingresela nuevamente: ";
        int valido = 0;

        // Se ingresa una dirección URL.
        System.out.println("Ingresa una direccion URL: ");
        URL = sc.nextLine(); // Se asigna el valor ingresado por el usuario a la variable
        
        // Se confirma que la URL ingresada sea válida
        
        while (valido == 0) {
            // Inicio correcto
            String inicioURL = URL.substring(0,7);
            String dominio = URL.substring(7); // URL sin inicio
            if (inicioURL.equals(inicio)) { // Válido
                // Se recorre el dominio para verificar que no contiene símbolos inválidos
                for (int i=0; i<dominio.length(); i++) {
                    char caracter = dominio.charAt(i);
                    switch(caracter){
                        // 13 casos posibles: ¿? ¡! “ # $ % & ( ) = @
                        case '¿':
                            valido++;
                            break;
                        case '?':
                            valido++;
                            break;
                        case '¡':
                            valido++;
                            break;
                        case '!':
                            valido++;
                            break;
                        case '"':
                            valido++;
                            break;
                        case '#':
                            valido++;
                            break;
                        case '$':
                            valido++;
                            break;
                        case '%':
                            valido++;
                            break;
                        case '&':
                            valido++;
                            break;
                        case '(':
                            valido++;
                            break;
                        case ')':
                            valido++;
                            break;
                        case '=':
                            valido++;
                            break;
                        case '@':
                            valido++;
                            break;
                        default:
                            break; // No pasa nada, porque el caracter es válido
                    } // Fin de los casos de caracteres inválidos
                } // Fin del for
                
                /* Se recorre el dominio en reversa para:
                    1. verificar largo mínimo del dominio
                    2. identificar el final de la URL
                */
                // Recorrido en reversa
                for (int j=(dominio.length()-1); j>0; j--) {
                    char caracter = dominio.charAt(j);
                    if (caracter == '.') { // Se identifica el último punto
                        // 1. Se debe verificar el largo del dominio
                        String largo = dominio.substring(0,j);
                        if (largo.length() < 3){
                            valido++;
                        } else {
                            String finalURL = dominio.substring(j); // Se extrae el final para analizar
                            // 4 casos válidos: .cl , .com , .org o .net
                            switch(finalURL) {
                                case ".cl":
                                    break;
                                case ".com":
                                    break;
                                case ".org":
                                    break;
                                case ".net":
                                    break;
                                default: // El final de la URL es inválido
                                    valido++;
                                    break;
                            } // Fin de los casos
                        } // Fin del else
                        j = 0; // El for no continuará luego de hallar el punto en el IF
                    } //Fin del IF
                } //Fin del for
            } else {
                valido++;
            }
            // Fin del análisis de la URL
            
            // Si la URL se identificó como "inválida"
            if (valido != 0) {
                System.out.println(invalido);
                URL = sc.nextLine(); // Se reescribe la URL
                valido = 0; // se reinicia el verificador
            } else { // Si es válida, se informa y se finaliza el programa
                System.out.println("La URL ingresada es valida. Muchas gracias :)");
                valido = -1;
            }
            
        } // Fin del while
    } // Fin del cuerpo del código
} // Fin de la clase

// rosé