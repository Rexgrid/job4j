package ru.job4j.tracker;




public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            //System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Выберите пункт меню: "));
            if (select == 0) {
                System.out.println("=== Добавить заявку ====");
              //  System.out.print();
                String name = input.askStr("Введите имя заявки: ");
                Item item = new Item(name);
                System.out.println("Заявка " + tracker.add(item).getName() + " добавлена. ID заявки: " + tracker.add(item).getId());
            } else if (select == 1) {
                System.out.println("======== Показать все заявки ========");
                Item[] item = tracker.findAll();
                for (Item value : item) {
                    System.out.println(value);
                }
            } else if (select == 2) {
                System.out.println("======== Редактировать заявку ========");
                //System.out.println();
                String id = input.askStr("Введите Id заявки: ");
                Item item = new Item("new");
                if (tracker.replace(id, item)) {
                    System.out.println("Операция выполнена " + item.getId() + " " + item.getName());
                } else {
                    System.out.println("Заявка не найдена");
                }
            } else if (select == 3) {
                System.out.println("======== Удаление заявки ========");
                //System.out.println();
                String id = input.askStr("Введите Id Заявки: ");
                if (tracker.delete(id)) {
                    System.out.println("Заявка " + id + " удалена.");
                } else {
                    System.out.println("======== Заявка не найдена ========");
                }
            } else if (select == 4) {
                System.out.println("======== Поиск заявки по Id ========");
                //System.out.println();
                String id = input.askStr("Введите Id заявки: ");
                Item item = tracker.findById(id);
                if (id != null) {
                    System.out.println("Заявка " + item.getName() + " Id:" + item.getId() + " найдена.");
                } else {
                    System.out.println("Заявка не найдена, введите корректный Id.");
                }
            } else if (select == 5) {
                System.out.println("======== Поиск заявки по имени ========");
                //System.out.println();
                String key = input.askStr("Введите имя заявки: ");
                Item[] item = tracker.findByName(key);
                for (Item value : item) {
                    System.out.println(value);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
