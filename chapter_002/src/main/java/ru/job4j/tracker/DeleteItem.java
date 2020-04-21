package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "======== Удаление заявки ========";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите Id Заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка " + id + " удалена.");
        } else {
            System.out.println("======== Заявка не найдена ========");
        }
        return true;
    }
}
