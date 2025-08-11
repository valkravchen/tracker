package ru.tracker.input;

import org.junit.jupiter.api.Test;
import ru.tracker.output.MockOutput;
import ru.tracker.output.Output;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new MockOutput();
        Input in = new MockInput(List.of("one", "1"));
        ValidateInput input = new ValidateInput(output, in);
        int result = input.askInt("Ввод:");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new MockOutput();
        Input in = new MockInput(List.of("3"));
        ValidateInput input = new ValidateInput(output, in);
        int result = input.askInt("Ввод:");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void whenMultipleValidInputs() {
        Output output = new MockOutput();
        Input in = new MockInput(List.of("1", "2", "3"));
        ValidateInput input = new ValidateInput(output, in);
        int result1 = input.askInt("Ввод 1:");
        int result2 = input.askInt("Ввод 2:");
        int result3 = input.askInt("Ввод 3:");
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(3);
    }

    @Test
    void whenNegativeNumber() {
        Output output = new MockOutput();
        Input in = new MockInput(List.of("-10"));
        ValidateInput input = new ValidateInput(output, in);
        int result = input.askInt("Ввод:");
        assertThat(result).isEqualTo(-10);
    }
}
