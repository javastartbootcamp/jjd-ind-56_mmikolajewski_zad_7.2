package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int countComparison = 0;
        int valueCatcher;
        boolean swapped = true;
        int lockedElementCount = 0;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < inputArray.length - 1 - lockedElementCount; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    valueCatcher = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = valueCatcher;
                    swapped = true;
                }
                countComparison++;
            }
            lockedElementCount++;
        }
        return countComparison;
    }
}