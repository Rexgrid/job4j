package ru.job4j.tracker;

public class ShowAllItem implements UserAction {
   @Override
    public String name() {
       return "======== Показать все заявки ========";
   }
        @Override
       public boolean execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(" " + item + " ");
            }
            return true;
        }
}
