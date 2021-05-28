package ua.tarasov.hw9;

class Chess {
    boolean checkTurn(int startIndexI, int startIndexJ, int finishIndexI, int finishIndexJ) {
        boolean validate = Math.abs(finishIndexI - startIndexI) + Math.abs(finishIndexJ - startIndexJ) == 3;
        if (startIndexI < 0 || finishIndexI < 0) {
            System.out.println("Это за пределами шахматной доски");
            validate = false;
        }
        return validate;
    }
}
