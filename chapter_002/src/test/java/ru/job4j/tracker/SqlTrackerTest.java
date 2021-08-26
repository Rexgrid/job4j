package ru.job4j.tracker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.job4j.tracker.Item;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class SqlTrackerTest {

    static Connection connection;

    @BeforeClass
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader().getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @After
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenHaveItemThenReplaceThatMustBeTrue() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("origin name");
        Item item2 = new Item("changed name");
        tracker.add(item1);
        assertThat(tracker.replace(item1.getId(), item2), is(true));
    }

    @Test
    public void whenDeleteItemThanHaveTrue() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("test");
        tracker.add(item);
        assertThat(tracker.delete(item.getId()), is(true));
    }

    @Test
    public void whenGetListAllItemsFromBdHaveListSameLenghtAsNumbersOfItems() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findAll().size(), is(2));
    }

    @Test
    public void whenWeHaveItemOnDbWeMayFindItByName() {
        SqlTracker tracker = new SqlTracker(connection);
        Item itm = new Item("first");
        tracker.add(itm);
        assertThat(tracker.findByName(itm.getName()).contains(itm), is(true));
    }

    @Test
    public void whenWeHaveItemOnDbWeMayFindItById() {
        SqlTracker tracker = new SqlTracker(connection);
        Item itm = new Item("first");
        Item itm2 = new Item("second");
        tracker.add(itm);
        tracker.add(itm2);
        assertThat(tracker.findById(itm.getId()), is(itm));
    }
}
