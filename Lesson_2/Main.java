public class Main {
    public static void main(String[] args) {
        printNonBooleanMethods();
        System.out.println();
        printBooleanMethods();
    }

    private static void printNonBooleanMethods() {
        NonBooleanMethods nbm = new NonBooleanMethods();

        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAverageGrade();
        nbm.countUniqueWords();
        nbm.showErrorMessage();
        nbm.syncCloudData();
        nbm.restoreBackup();
        nbm.pauseDownload();
        nbm.resetSettings();
        nbm.writeToFile();
        nbm.convertTemperature();
        nbm.inputMathExpression();
        nbm.findGameWinner();
        nbm.findBookByAuthor();
    }

    private static void printBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();

        System.out.println(bm.isRunningProgram());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isInputLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasGameLives());
        System.out.println(bm.isEmptyString());
        System.out.println(bm.isEvenDice());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isExistFile());
    }
}