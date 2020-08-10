package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> newacc = users.get(user);
            if (!newacc.contains(account)) {
                newacc.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                result = key;
                break;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> a = users.get(user);
            for (Account acc : a) {
                if (acc.getRequisite().equals(requisite)) {
                    result = acc;
                    break;
                }
            }
        }

        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAcc != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

