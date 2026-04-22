public class Main {
    public static void main(String[] args) {
        printNonBooleanMethods();
        System.out.println();
        printBooleanMethods();
    }

    public static void printNonBooleanMethods() {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();

        nonBooleanMethods.findLongestWord();
        nonBooleanMethods.selectMenuItem();
        nonBooleanMethods.calculateAverageGrade();
        nonBooleanMethods.countUniqueWords();
        nonBooleanMethods.showErrorMessage();
        nonBooleanMethods.syncCloudData();
        nonBooleanMethods.restoreBackup();
        nonBooleanMethods.pauseDownload();
        nonBooleanMethods.resetSettings();
        nonBooleanMethods.writeToFile();
        nonBooleanMethods.convertTemperature();
        nonBooleanMethods.inputMathExpression();
        nonBooleanMethods.findGameWinner();
        nonBooleanMethods.findBookByAuthor();
    }

    public static void printBooleanMethods() {
        BooleanMethods booleanMethods = new BooleanMethods();

        System.out.println(booleanMethods.isRunningProgram());
        System.out.println(booleanMethods.hasUniqueDigit());
        System.out.println(booleanMethods.isInputLetter());
        System.out.println(booleanMethods.hasEqualDigits());
        System.out.println(booleanMethods.hasGameLives());
        System.out.println(booleanMethods.isEmptyString());
        System.out.println(booleanMethods.isEvenDice());
        System.out.println(booleanMethods.isValidPath());
        System.out.println(booleanMethods.isExistFile());
    }
}