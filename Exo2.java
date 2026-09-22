/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exo2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exo2 {

   public static void main(String[] args) {

    // Déclaration des variables
        int nb;
        int result;
        int ind;

        // Demande du nombre
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntrer le nombre : ");
        nb = sc.nextInt();

        result = 0;

        // Addition des nb premiers entiers
        ind = 1;

        while (ind <= nb) {
            result = result + ind;
            ind++; //l'erreur est la il manquait cette ligne faut increment l'indice sinon il reste bloqué a 1, donc pas de resultat 
        }

        // Affichage du résultat
        System.out.println("La somme des " + nb + " entiers est : " + result);
 
   }
}