package org.java.exceptions;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Inserisci il numero di libri: ");
			int n = in.nextInt();

			Book[] books = new Book[n];

			for (int i = 0; i < n; i++) {
			    try {
			        System.out.println("Inserisci i dati per il libro " + (i + 1) + ":");
			        System.out.print("Titolo: ");
			        String title = in.next();

			        System.out.print("Numero di pagine: ");
			        int pageNumber = in.nextInt();

			        System.out.print("Autore: ");
			        String author = in.next();

			        System.out.print("Editore: ");
			        String publisher = in.next();

			        Book b = new Book(title, pageNumber, author, publisher);


			        books[i] = b;

			        System.out.println("Libro inserito con successo: " + "\n" + b);
			    } catch (Exception e) {
			        System.out.println("Errore: " + e.getMessage());
			        i--; 
			    }
			}
			System.out.println("Elenco dei libri inseriti: ");
			System.out.println(books.toString());
		}
    }
}
