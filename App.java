/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        //Creates Book objects with title, author, and ISBN
        Book book1 = new Book("Oliver Twist","Charles Dickens","1234567");
        Book book2 = new Book("Animal Farm","George Orwell","5462892");

        //Adds the created book objects to the library
        library.addBook(book1);
        library.addBook(book2);

        //Creates Patron objects with name and ID
        Patron patron1 = new Patron("Justin","CL459");
        Patron patron2 = new Patron("James","CL653");

        //Registers the created Patron objects with the library
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        //Lists available books in the library
        library.listAvailableBooks();

        //Checks out a book with a particular ISBN and patron id
        library.checkoutBook("1234567", patron1.getPatronId());

        //Returns a book to the library using a particular ISBN
        library.returnBook("1234567");

        library.listAvailableBooks();
    }
}
