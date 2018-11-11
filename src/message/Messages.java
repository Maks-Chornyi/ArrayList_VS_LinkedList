package message;

import java.util.List;

public class Messages {
    private static final String SET_BOLD_TEXT = "\033[0;1m";
    private static final String SET_PLAIN_TEXT = "\033[0;0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String REPLACE_STRING = "java.util.";

    private Messages() {}

    public static void separateLines() {
        System.out.println("\n============================================================\n");
    }

    public static void filledArrayMessage(long time, int listSize, List<Integer> list) {
        System.out.println("Spent " + time + " ms to insert " + listSize + " elements into \t\t" + SET_BOLD_TEXT +
                ANSI_GREEN + list.getClass().getName().replace(REPLACE_STRING,"") + SET_PLAIN_TEXT +
                ANSI_RESET);
    }

    public static void removeMessage(long time, int position, List<Integer> list) {
        System.out.println("Spent " + time + " ms to delete elem in " + position + " index from " + SET_BOLD_TEXT +
                ANSI_GREEN + list.getClass().getName().replace(REPLACE_STRING,"") + SET_PLAIN_TEXT +
                ANSI_RESET + " which has " + list.size() + " elements");
    }

    public static void insertMessage(long time, int position, List<Integer> list) {
        System.out.println("Spent " + time + " ms to insert elem in " + position + " index to "+ SET_BOLD_TEXT +
                ANSI_GREEN + list.getClass().getName().replace(REPLACE_STRING,"") + SET_PLAIN_TEXT +
                ANSI_RESET + " which has " + list.size() + " elements");
    }
}
