package session8.challenge.challange10_diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//10. Write a program that manages a personal diary using an ArrayList. Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day. Your program should allow the user to:
//	Add a new entry (but ensure there's no duplicate date).
//	Edit an existing entry based on the date.
//	Delete an entry by date.
//	Display all entries in reverse chronological order (latest first).
//
//Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every time.

// i would normally have 2 separate lists, or a struct
public class Diary {

    List<String> entries;
    final private Comparator<String> diaryComparator; //could make this static

    public Diary() {
        entries = new ArrayList<>();

        // sort by reverse chronological order
        diaryComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                LocalDate date1 = LocalDate.parse(o1.substring(0, 10));
                LocalDate date2 = LocalDate.parse(o2.substring(0, 10));
                return date2.compareTo(date1);
            }
        };
    }

    // Could change arguments to LocalDate date, and String entry, then combine them in function
    public void addEntry(LocalDate date, String entryStr) {
        // combine the parameters to satisfy problem specs
        String entry = date.toString() + " : " + entryStr;
        // sort by reverse chronological order
        int InsertIndex = Collections.binarySearch(entries, entry, diaryComparator);
        if (InsertIndex > -1) {
            System.out.println("Failed Add, the date is a duplicate!");
            return;
        }
        InsertIndex++;
        InsertIndex = -InsertIndex;
        entries.add(InsertIndex, entry);
    }

    public String removeEntry(LocalDate date) {
        int removeIndex = Collections.binarySearch(entries, date.toString(), diaryComparator);
        if (removeIndex < 0) {
            System.out.println("Failed Remove, the date doesn't exist!");
            return null;
        }
        return entries.remove(removeIndex);
    }

    public void editEntry(LocalDate date, String entryStr) {
        String entry = date.toString() + " : " + entryStr;
        int editIndex = Collections.binarySearch(entries, entry, diaryComparator);
        if (editIndex < 0) {
            System.out.println("Failed edit, the date doesn't exist!");
            return;
        }
        entries.set(editIndex, entry);
    }

    public void displayEntries() {
        System.out.println("~ DIARY : ~"); // these can be multiple lines
        for (String entry : entries) {
            System.out.println(entry); // these can be multiple lines
        }
    }


    public void displayEntriesFancy() {
        System.out.println();
        System.out.println("~ DIARY : ~"); // these can be multiple lines
        System.out.println("############################");
        System.out.println();
        for (String entry : entries) {
            System.out.println(entry); // these can be multiple lines
            System.out.println();
            System.out.println("############################");
            System.out.println();
        }
    }

}
