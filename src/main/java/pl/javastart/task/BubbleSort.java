package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int countComparison = 0;
        int valueCatcher;
        boolean swapped;

        for (int i = 0; i < inputArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    valueCatcher = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = valueCatcher;
                    swapped = true;
                }
                countComparison++;
            }
            if (!swapped) {
                break;
            }
        }
        return countComparison;
    }
}