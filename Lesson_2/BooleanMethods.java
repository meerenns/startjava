public class BooleanMethods {
    public boolean isRunningProgram() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> программа выполняется? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> есть уникальная цифра? ");
        return false;
    }

    public boolean isInputLetter() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> введена буква? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> есть равные цифры? ");
        return false;
    }

    public boolean hasGameLives() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> остались попытки? ");
        return true;
    }

    public boolean isEmptyString() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> строка пустая? ");
        return false;
    }

    public boolean isEvenDice() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> путь действительный? ");
        return true;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> файл существует? ");
        return false;
    }
}