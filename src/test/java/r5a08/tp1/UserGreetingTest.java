package r5a08.tp1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserGreetingTest {

    @Test
    void shouldFormatGreeting() {
        String result = UserGreeting.formatGreeting("Tawfiq");

        assertThat(result)
                .isEqualTo("Bonjour, Tawfiq");
    }

    @Test
    void shouldRejectEmptyName() {
        assertThatThrownBy(() ->
                UserGreeting.formatGreeting("")
        ).isInstanceOf(UserGreetingFailureException.class);
    }

    @Test
    void shouldRejectNameLongerThan10Characters() {
        assertThatThrownBy(() ->
                UserGreeting.formatGreeting("ABCDEFGHIJK")
        ).isInstanceOf(UserGreetingFailureException.class);
    }

    @Test
    void shouldRejectNameWithSpaces() {
        assertThatThrownBy(() ->
                UserGreeting.formatGreeting("Tawfiq Ali")
        ).isInstanceOf(UserGreetingFailureException.class);
    }

    @Test
    void shouldRejectNameWithSpecialCharacters() {
        assertThatThrownBy(() ->
                UserGreeting.formatGreeting("Tawfiq-")
        ).isInstanceOf(UserGreetingFailureException.class);
    }

    @Test
    void shouldAcceptNameWith10Characters() {
        String result = UserGreeting.formatGreeting("ABCDEFGHIJ");

        assertThat(result)
                .isEqualTo("Bonjour, ABCDEFGHIJ");
    }
}
