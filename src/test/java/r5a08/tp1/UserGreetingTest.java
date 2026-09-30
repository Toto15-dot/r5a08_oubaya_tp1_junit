package r5a08.tp1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserGreetingTest {

    @Test
    void shouldFormatGreeting() {
        String result = UserGreeting.formatGreeting("Tawfiq");

        assertThat(result).isEqualTo("Bonjour, Tawfiq");
    }
}
