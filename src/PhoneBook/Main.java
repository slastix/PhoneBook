package PhoneBook;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> book;

    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }

    public void start() {
        book = new ArrayList<Contact>();
        while (true) {
            System.out.println("Сделайте выбор:");
            System.out.println("1 - добавить контакт");
            System.out.println("2 - удалить контакт");
            System.out.println("3 - вывести все контакты");
            System.out.println("4 - поиск по имени");
            System.out.println("5 - редактировать контакт");
            System.out.println("6 - выход");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
                if (x == 1) addContact();
                else if (x == 2) delContact();
                else if (x == 3) printContacts();
                else if (x == 4) searchContact();
                else if (x == 5) editContact();
                else if (x == 6) System.exit(0); //выход
                else System.out.println("Не верное значение. Попробуйте еще раз");
            System.out.println();
            }
    }
    public void addContact () {
        // Добавление контакта
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:" );
        String name = scan.next();
        System.out.println("Введите номер телефона:");
        String phone = scan.next();
        System.out.println("Введите E-mail:");
        String email = scan.next();
        Contact contact = new Contact(name, phone, email);
        book.add(contact);
        System.out.println("Новый контакт добавлен");
        System.out.println();
    }
    public void delContact () {
        // Удаление контакта
        System.out.println("Введите имя контакта, который нужно удалить:");
        Scanner scan = new Scanner(System.in);
        String deleted = scan.next();
        for (int i = 0; i < book.size(); i++) {
            if (deleted.equals(book.get(i).name)) {
                book.remove(i);
                System.out.println("Контакт " + deleted + " удален");
            }
        }

    }
    public void printContacts () {
        // Вывод всех контактов
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
        }
    }
    public void searchContact () {
        System.out.println("Введите имя искомого контакта:");
        Scanner scan = new Scanner (System.in);
        String searched = scan.next();
        for (int i = 0; i < book.size(); i++) {
            if (searched.equals(book.get(i).name)) {
                System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
            }
        }
    }
    public void editContact () {
        System.out.println("Введите имя контакта, который нужно отредактировать:");
        Scanner scan = new Scanner (System.in);
        String searched = scan.next();
        for (int i = 0; i < book.size(); i++) {
            if (searched.equals(book.get(i).name)) {
                System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
                System.out.println("Введите новое имя:");
                book.get(i).name = scan.next();
                System.out.println("Введите новый номер телефона:");
                book.get(i).phone = scan.next();
                System.out.println("Введите новый E-mail:");
                book.get(i).email = scan.next();
                System.out.println("Данные контакта обновлены");
            }
        }
    }
}


// Создать две коллекции и заполнить их именами.
// а) В третью коллекцию записываются имена первых двух без повторов.
// б) В третью записываются только те, которые есть в обеих коллекциях
