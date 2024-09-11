package task0_theory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testing.task0_theory.Numbers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {

    @Test
    public void shouldReturnTrueForOddNumbers() {
        int number = 99;
        boolean actualResult = Numbers.isOdd(number);
        assertThat(actualResult).isTrue();
    }

    @Test
    public void shouldReturnTrueForEvenNumbersList() {
        List<Integer> numbers = List.of(12, 14, 98, -100, 2);

        numbers.forEach(it -> assertThat(it).isEven());
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14, 98, -100, 2})
    public void shouldReturnFalseForOddNumbers(int number) {
        boolean actualResult = Numbers.isOdd(number);
        assertThat(actualResult).isFalse();
    }
}
