package HomeTaskBy18042022;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] peopleNames = new String[6];
        peopleNames[0] = "Susanna";
        peopleNames[1] = "Philip";
        peopleNames[2] = "Alice";
        peopleNames[3] = "Mike";
        peopleNames[4] = "George";
        peopleNames[5] = "Mag";

        Arrays.sort(peopleNames);

        for (int i = 0; i < 6; i++) {
            System.out.println(peopleNames[i]);
        }
    }
}
