package org.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library {
	
	static final File test = new File("C:\\test.txt");
	
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
			
			//WRITE
			
			FileWriter myWriter = null;

			try {
			    myWriter = new FileWriter(test);

			    
			    for (int x=0;x<books.length;x++) {
			        myWriter.write(books[x].toString());
			    }

			} catch (IOException e) {
			    e.printStackTrace();
			} finally {
			    try {
			        if (myWriter != null) {
			            myWriter.close();
			        }
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}

			System.out.println("Elenco dei libri inseriti: ");
			for (int x=0;x<books.length;x++) {
			    System.out.println(books[x]);
			}
			
			// READ
			
			Scanner reader = null;
			try {
				
				reader = new Scanner(test);
				
				while (reader.hasNextLine()) {
				   String data = reader.nextLine();
				   System.out.println(data);
				}
			} catch (FileNotFoundException e) {
				
				System.out.println("Error reading file: " + e.getMessage());
			} finally {
				
				if (reader != null)
					reader.close();
			}
			System.out.println("Elenco dei libri inseriti: ");
			System.out.println(books.toString());
		}
    }
}
