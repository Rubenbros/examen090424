import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MainTest {

    @Test
    @DisplayName("Password menos de 8 caracteres")
    void passwordMenosDe8Caracteres() {
        assertThrows(IllegalArgumentException.class, () -> Main.passwordValidator("1234567"));
    }

    @Test
    @DisplayName("Password sin mayuscula")
    void passwordSinMayuscula() {
        assertThrows(IllegalArgumentException.class, () -> Main.passwordValidator("12345678"));
    }

    @Test
    @DisplayName("Password sin minuscula")
    void passwordSinMinuscula() {
        assertThrows(IllegalArgumentException.class, () -> Main.passwordValidator("12345678A"));
    }

    @Test
    @DisplayName("Password con mayuscula y minuscula y 8 caracteres")
    void passwordConMayusculaYMinuscula() {
        assertTrue(Main.passwordValidator("12345678Aa"));
    }
}