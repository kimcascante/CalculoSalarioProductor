package Proyecto;

/**
 * Nombre del programa: La vaca lechera
 * Descripcion: calcule cuánto hay que pagarle a un productor que realizó tres entregas. El programa recibe
    como entrada el id del productor, la cantidad de botellas de la primera entrega, la
    cantidad de botellas de la segunda entrega, la cantidad de botellas de la tercera entrega,
    el promedio general de entregas realizado por todos los productores, el precio que se le
    va a pagar a cada productor por cada botella entregada y el premio que se le va a pagar
    a los productores que realizaron más entregas que el promedio. El diagrama deberá de
    imprimir el monto que hay pagarle al productor
 * Autor: Kimberly C.
 * Fecha de creacion: 14-6-2020
 * Modificado por: Kimberly C.
 * fecha de modificacion: 14-6-2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class entregableUno {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        double pagarProductor;
        int idProductor;
        int cantBotellasPrimerEntrega;
        int cantBotellasSegundaEntrega;
        int cantBotellasTercerEntrega;
        double promedioGeneralEntregas;
        double pagarBotella;
        double premio;
        int sumaBotellas;
        String recibePremio;

        escribir.println("Digite el ID del productor:");
        idProductor = Integer.parseInt(leer.readLine());

        escribir.println("Digite la cantidad de botellas de la primer entrega:");
        cantBotellasPrimerEntrega = Integer.parseInt(leer.readLine());

        escribir.println("Digite la cantidad de botellas de la segunda entrega:");
        cantBotellasSegundaEntrega = Integer.parseInt(leer.readLine());

        escribir.println("Digite la cantidad de botellas de la tercer entrega:");
        cantBotellasTercerEntrega = Integer.parseInt(leer.readLine());

        escribir.println("Digite el promedio general de entregas de todos los productores:");
        promedioGeneralEntregas = Integer.parseInt(leer.readLine());

        escribir.println("Digite el precio que se le paga por cada botella:");
        pagarBotella = Integer.parseInt(leer.readLine());

        escribir.println("Digite el premio a dar al productor con mas entregas:");
        premio = Integer.parseInt(leer.readLine());

        sumaBotellas = cantBotellasPrimerEntrega + cantBotellasSegundaEntrega + cantBotellasTercerEntrega;

        pagarProductor = sumaBotellas * pagarBotella;

        int promedioProductor = sumaBotellas / 3;

        if (promedioProductor>=promedioGeneralEntregas){
            recibePremio = "El productor recibe el premio de " +premio;
        } else{
            recibePremio = "El productor no recibe premio";
        }

        escribir.println("El monto a pagar al productor " +idProductor+ " es de: " +pagarProductor);
        escribir.println(recibePremio);
    }
}