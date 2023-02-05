package Homework12;

    public class Main {
         public static void main (String[]arg){
             System.out.println("------------------------------");

             Author author1 = new Author("Иван","Тургенев");
             System.out.println(author1);
             Book book1 = new Book();
             book1.setName("Ася");
             System.out.println("Название книги - " +book1.getName());
             book1.setYear(1858);
             System.out.println("Год написания - " +book1.getYear());
             book1.setYear(1859);
             System.out.println("Исправленый год - " +book1.getYear());

             System.out.println("------------------------------");

             Author author2 = new Author("Николай","Гоголь");
             System.out.println(author2);
             Book book2 = new Book();
             book2.setName("Мертвые Души");
             System.out.println("Название книги - " +book2.getName());
             book2.setYear(1842);
             System.out.println("Год написания - " +book2.getYear());
             book2.setYear(1845);
             System.out.println("Исправленый год - " +book2.getYear());

             System.out.println("------------------------------");
         }
    }



