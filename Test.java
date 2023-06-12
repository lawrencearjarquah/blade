package Esercizio_2;

public class Test {
    public static void main(String[] args){
        int a = 15;
        // Aggiungere 5 alla variabile a senza ripeterlo
        a += 5;
        // Sottrarre 4 da a senza ripeterlo
        a -= 4;
        // Assegnare il valore di a all' int b
        int b = 15;
        // Incrementare b di una unità senza ripertere la variabile
        b += 1;

        // Verificare se b è un numero disparo
        System.out.println(b % 2 == 0);
        // Verificare se il prodotto di b e b + 1 è un multiplo di 3
        System.out.print((b * b + 1) % 3 == 0);

    }
}
