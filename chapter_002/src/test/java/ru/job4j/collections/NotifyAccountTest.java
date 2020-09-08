package ru.job4j.collections;

import org.junit.Test;
import ru.job4j.collection.Account;
import ru.job4j.collection.NotifyAccount;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void duplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("1111", "Andrew", "a123d"),
                new Account("1111", "Josh", "D21e1"),
                new Account("23113", "Dansel", "14s8QQ")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("1111", "Andrew", "a123d"),
                        new Account("23113", "Dansel", "14s8QQ")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}