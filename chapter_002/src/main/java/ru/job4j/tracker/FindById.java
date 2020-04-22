package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "======== Поиск заявки по Id ========";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите Id заявки: ");
        Item item = tracker.findById(id);
            System.out.println(item);
        return true;
    }
}
