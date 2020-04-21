package ru.job4j.tracker;




public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Выберите пункт меню: "));
            if (select == 0) {
                StartUI.addItem(input, tracker);
            } else if (select == 1) {
              StartUI.showAll(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
              StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
              StartUI.findById(input, tracker);
            } else if (select == 5) {
             StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void addItem(Input input, Tracker tracker) {
        System.out.println("=== Добавить заявку ====");
        String name = input.askStr("Введите имя заявки: ");
        Item item = new Item(name);
        tracker.add(item).getId();
        System.out.println(item);
    }
    public static void showAll(Input input, Tracker tracker) {
        System.out.println("======== Показать все заявки ========");
        Item[] item = tracker.findAll();
        for (Item value : item) {
            if (item != null) {
                System.out.println(value);
            } else {
                 System.out.println("Заявки не найдены. Добавьте заявку.");
            }
        }
        }
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("======== Редактировать заявку ========");
        String id = input.askStr("Введите Id заявки: ");
        String name = input.askStr("Введите новое имя заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println(item);
        } else {
            System.out.println("Заявка не найдена");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("======== Удаление заявки ========");
        String id = input.askStr("Введите Id Заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка " + id + " удалена.");
        } else {
            System.out.println("======== Заявка не найдена ========");
        }
    }
    public static void findById(Input input, Tracker tracker) {
        System.out.println("======== Поиск заявки по Id ========");
        String id = input.askStr("Введите Id заявки: ");
        Item item = tracker.findById(id);
        if (id != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка не найдена, введите корректный Id.");
        }
    }
    public static void findByName(Input input, Tracker tracker) {
        System.out.println("======== Поиск заявки по имени ========");
        String key = input.askStr("Введите имя заявки: ");
        Item[] item = tracker.findByName(key);
        for (Item value : item) {
            System.out.println(value);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
