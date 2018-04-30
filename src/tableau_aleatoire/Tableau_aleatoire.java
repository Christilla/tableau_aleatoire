/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau_aleatoire;
import java.util.Scanner;
/**
 *
 * @author Christilla
 */
public class Tableau_aleatoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        //création de l'objet Scaner
        int taille = sc.nextInt();
        //création de la variable de type int, qui va stocker celle saisie dans la console
        int tab []= new int [taille];
        //création du tableau qui stocke en type int
        for (int i = 0; i<=tab.length -1; i++){
            tab[i]= (int) (Math.random() * 100);
               //création de la boucle aléatoire
            System.out.println(tab[i] +"="+i);
            //affiche le résultat en faisant un retour à la ligne
        }
     
        
    }
    
}
