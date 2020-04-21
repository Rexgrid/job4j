package ru.job4j.tracker;

public class ShowAllItem implements UserAction {
   @Override
    public String name() {
       return "======== Показать все заявки ========";
   }
        @Override
       public boolean execute(Input input, Tracker tracker) {
            Item[] item = tracker.findAll();
            for (Item value : item) {
                System.out.println(value);
            }
            return true;
        }
}
