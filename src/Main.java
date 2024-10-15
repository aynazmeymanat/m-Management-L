public class Main {
    public static void main(String[] args) {

        Library library = new Library("lib1");

        Book book4 = new Book("98765", "library", "x1");
        Book book1 = new Book("58736", "math", "x2");
        Book book2 = new Book("82649", "phisices", "x3");
        Book book3 = new Book("95317", "history", "x4");
        Book book5 = new Book("64025", "math", "x5");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        Member member1 = new Member("087463", "Aynaz");
        Member member2 = new Member("864200", "Dora");

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(book1 , member2);
        library.borrowBook(book2 , member2);
        library.borrowBook(book3 , member2);

        library.borrowBook(book5 , member1);
        library.borrowBook(book4 , member1);
        library.borrowBook(book3 , member1);


        library.returnBook(book5,member1);
        library.returnBook(book2,member2);



        library.printLibraryInfo();

    }

}
