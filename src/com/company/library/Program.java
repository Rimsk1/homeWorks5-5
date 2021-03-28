package com.company.library;

public class Program {
//    Book book;
//     int numRep;
//
public static void main(String[] args) {
    Author author1 = new Author("Марк","Твен");
    Author author2 = new Author("Эрнест","Хэммингуей");
    Author author3 = new Author("Виктор","Пелевин");
    Author author4 = new Author("Аркадий", "Стругацкий");
    Author author5 = new Author("Борис", "Стругацкий");
    Author author6 = new Author("Джордж", "Оруел");
    Author author7 = new Author("Нил", "Гейман");
    Author author8 =new Author("Терри", "Пратчет");
    Author author9 = new Author("Чак", "паланик");

    Book book1 = new Book();
    book1.setName("Том Сойер");
    book1.setYears(1880);
    book1.setPages(600);
    book1.setAuthor(author1);


    System.out.println( book1);

    Book book2 = new Book();
    book2.setAuthors(new Author[]{author4, author5});
    book2.setName("Пикник на обочине");
    book2.setPages(600);
    book2.setYears(1980);
    System.out.println(book2);

    Book book3 = new Book();
    book3.setName("Праздник который всегда с тобой");
    book3.setPages(500);
    book3.setAuthor(author2);
    book3.setYears(1977);

    Book book4 = new Book();
    book4.setName("Empire V");
    book4.setPages(520);
    book4.setYears(2010);
    book4.setAuthor(author3);

    Book book5 = new Book();
    book5.setName("1984");
    book5.setYears(1984);
    book5.setPages(300);
    book5.setAuthor(author6);

    Library library1= new Library();
    library1.addBooks(book1);
    library1.addBooks(book2);
    System.out.println(library1);


//    Book book6 = new Book();
//    book6.name = "Добрые предзнаменования";
//    book6.years = 2015;
//    book6.pages = 500;
//
//    Book book7 = new Book();
//    book7.name = "Бойцовский Клуб";
//    book7.years = 2000;
//    book7.pages = 450;






}
}
