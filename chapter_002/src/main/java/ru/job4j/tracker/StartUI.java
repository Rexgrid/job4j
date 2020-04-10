package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Добавить заявку ====");
                System.out.print("Введите имя заявки: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Заявка " + tracker.add(item).getId() + " добавлена");
            } else if (select == 1) {
                System.out.println("======== Показать все заявки ========");
                Item[] item = tracker.findAll();
                for (Item value : item) {
                    System.out.println(value.getName());
                }
            } else if (select == 2) {
                System.out.println("======== Редактировать заявку ========");
                System.out.println("Введите Id заявки: ");
                String id = scanner.nextLine();
                Item item = new Item("new");
                if (tracker.replace(id, item)) {
                    System.out.println("Операция выполнена " + item.getId());
                } else {
                    System.out.println("Заявка не найдена");
                }
            } else if (select == 3) {
                System.out.println("======== Удаление заявки ========");
                System.out.println("Введите Id Заявки: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Заявка " + id + " удалена.");
                } else {
                    System.out.println("======== Заявка не найдена ========");
                }
            } else if (select == 4) {
                System.out.println("======== Поиск заявки по Id ========");
                System.out.println("Введите Id заявки: ");
                String id = scanner.nextLine();
                tracker.findById(id);
                System.out.println("Заявка " + id + " найдена.");
            } else if (select == 5) {
                System.out.println("======== Поиск заявки по имени ========");
                System.out.println("Введите имя заявки: ");
                String key = scanner.nextLine();
                Item[] item = tracker.findByName(key);
                for (Item value : item) {
                    System.out.println("Заявка " + value.getName() + " найдена.");
                }
            } else if (select == 6) {
               run = false;
            }
        }
    }


    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all Item");
        System.out.println("2. Edit Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Find Item by Id");
        System.out.println("5. Find Item by Name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
