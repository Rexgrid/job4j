package ru.job4j.tracker;

public class CreateItem implements UserAction {
    @Override
    public String name() {
        return "=== Добавить заявку ====";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя заявки: ");
        Item item = new Item(name);
        tracker.add(item).getId();
        System.out.println(item);
        return true;
    }
}
