package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest0() {
        Assertions.assertTrue (33 > 11);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue (11 > 9);
    }

    @Test
    void exampleTest2() {
        Assertions.assertTrue (2 > 1);
    }
}
