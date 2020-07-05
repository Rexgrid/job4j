package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
            List<Account> a = users.get(user);
            if (user != null) {
                if (!a.contains(account)) {
                    users.put(user, Collections.singletonList(account));
                }
            }
        }

    public User findByPassport(String passport) {
        User result = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                result = key;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        List<Account> a = users.get(user);
        for (Account acc : a) {
            if (acc.getRequisite().equals(requisite)) {
                result = acc;
            } else {
                result = null;
            }
          
        }

        return result;
    }

  public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
      List<Account> accounts = new ArrayList<>();
      int index = accounts.indexOf(new Account(srcRequisite, -1));
      Account srcAccount = accounts.get(index);
        if (srcAccount == null || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            Account destAcc = findByRequisite(destPassport, destRequisite);
            destAcc.setBalance(destAcc.getBalance() + amount);
        }
        return rsl;
    }
}

