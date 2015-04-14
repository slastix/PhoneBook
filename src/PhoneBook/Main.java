package PhoneBook;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/*
1) добавить контакт
2) удалить контакт
3) вывести все контакты
4) выход
 */
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
            System.out.println("4 - выход");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
                if (x == 1) {
                    // Добавление контакта
                    System.out.println("Введите имя:" );
                    String name = scan.nextLine();
                    System.out.println("Введите номер телефона:");
                    String phone = scan.nextLine();
                    System.out.println("Введите E-mail:");
                    String email = scan.nextLine();
                    Contact contact = new Contact(name, phone, email);
                    book.add(contact);
                }
                else if (x == 2) {
                    // Удаление контакта
                }
                else if (x == 3) {
                    // Вывод всех контактов
                    for (int i = 0; i < book.size(); i++) {
                    System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
                    }
                }
                else if (x == 4) {
                    // Выход
                }
                else System.out.println("Не верное значение. Попробуйте еще раз");
            }
    }
}

// Поиск по имени
// Редактирование контакта
//   -- Изменить имя
//   -- Изменить номер
//   -- Изменить email
//   -- Сохранить

// Создать две коллекции и заполнить их именами.
// а) В третью коллекцию записываются имена первых двух без повторов.
// б) В третью записываются только те, которые есть в обеих коллекциях
