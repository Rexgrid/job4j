package ru.job4j.tracker;

public class EditItem implements UserAction {

    @Override
    public String name() {
        return "======== Редактировать заявку ========";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int id = input.askInt("Введите Id заявки: ");
        String name = input.askStr("Введите новое имя заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена");
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;
    }
}
