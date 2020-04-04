package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 123);
        Book callOfCtulhu = new Book("Call of Ctulhu", 560);
        Book littleWonam = new Book("Little Woman", 350);
        Book godFather = new Book("God Father", 600);

        Book[] book = new Book[4];

        book[0] = cleanCode;
        book[1] = callOfCtulhu;
        book[2] = littleWonam;
        book[3] = godFather;

        for (int index = 0; index < book.length; index++) {
            Book bk = book[index];
            System.out.println(bk.getName() + " количество страниц: " + bk.getPageCount());
        }

        System.out.println("Меняем местами первую и третью книги");
        Book temp = book[0];
        book[0] = book[2];
        book[2] = temp;

        for (int index = 0; index < book.length; index++) {
            Book bk = book[index];
            System.out.println(bk.getName() + " количество страниц: " + bk.getPageCount());
        }


        System.out.println("Вывод книг с названием Clean Code");
        for (int index = 0; index < book.length; index++) {
            Book bk = book[index];
            if (bk.getName() == "Clean Code") {
                System.out.println(bk.getName() + " количество страниц: " + bk.getPageCount());
            }
        }
    }
}
