package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // Метод повертає список імен
    public List<String> getData() {
        List<String> list = new ArrayList<String>();
        list.add("Du, du hast, du hast mich");
        list.add("Du, du hast, du hast mich, du hast mich");
        list.add("Du hast mich gefragt, du hast mich gefragt");
        list.add("Du hast mich gefragt und ich hab nichts gesagt");
        list.add("Willst du bis der Tod euch scheidet");
        list.add("Treu ihr sein für alle Tage?");
        list.add("Nein!");
        list.add("Nein!");
        return list;
    }
}
