//Belkout fares calculator


package Calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        // on cree le scanner
        Scanner sc = new Scanner(System.in);

        
        // EXERCICE 2
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // EXERCICE 3
     
        // le choix de l'utilisateur 
        System.out.print("Votre choix : ");

        
        int operateur = sc.nextInt();

        // EXERCICE 4
      
        // premiere valeur
        System.out.print("Please enter the first number: ");

        int operande1 = sc.nextInt();

        // EXERCICE 5

        // deuxieme valeur
        System.out.print("Please enter the second number: :");

     
        int operande2 = sc.nextInt();

        // EXERCICE 6
      
        
        int resultat = 0;

        // On regarde quel opérateur l'utilisateur a choisi
        if (operateur == 1) {

            // addition
            resultat = operande1 + operande2;

        } else if (operateur == 2) {

            // 2 = soustraction
            resultat = operande1 - operande2;

        } else if (operateur == 3) {

            // 3 = multiplication
            resultat = operande1 * operande2;

        } else if (operateur == 4) {

            // 4 = division
            resultat = operande1 / operande2;

        } else if (operateur == 5) {

            // 5 = modulo (reste de la division)
            resultat = operande1 % operande2;

        } else {

            // Si l'utilisateur entre autre chose que 1 à 5
            System.out.println("Opérateur invalide !");
            return;
        }

        
        System.out.println("Résultat : " + resultat);
        
         
    }
}
