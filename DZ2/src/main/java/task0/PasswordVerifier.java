package task0;

public class PasswordVerifier {
    public void verify(String password) throws ExceptionPassword {
        if (password.length() < 8) {
            throw new ExceptionPassword("Количество символов должно быть 8 или более");
        }
        boolean containsDigit = false;
        boolean containsUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
            }
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            }
        }
        if (!containsDigit) {
            throw new ExceptionPassword("Пароль должен содержать хотя бы одну цифру");
        }
        if (!containsUpperCase) {
            throw new ExceptionPassword("Пароль должен содержать хотя бы одну заглавную букву");
        }
    }
}

