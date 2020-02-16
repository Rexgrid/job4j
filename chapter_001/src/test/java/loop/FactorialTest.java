package loop;

import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class FactorialTest {
        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
           int rsl = Factorial.calc(5);
           int excepted = 120;
           assertThat(rsl, is(excepted));//напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        }

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            int rsl = Factorial.calc(0);
            int excepted = 1;
            assertThat(rsl, is(excepted)); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        }
    }
