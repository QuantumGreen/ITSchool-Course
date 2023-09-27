package session8.challenge.challange10_diary;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Diary diary = new Diary();
        LocalDate baseDate = LocalDate.of(2023, 9, 1);
        diary.addEntry(baseDate, "Dear Diary, today I did some coding");
        diary.addEntry(baseDate.plusDays(1), "Dear Diary, today I did some coding");
        diary.addEntry(baseDate.plusDays(2), "Dear Diary, today I did some coding");

        // test duplicate
        System.out.println("Testing Duplicate");
        diary.addEntry(baseDate, "Dear Diary, today I did some coding");

        // test correct order + display
        // they were added date order 1 2 3
        // should show 3 2 1 at day value
        System.out.println("Testing display");
        diary.displayEntries();

        // test edit
        System.out.println("Testing edit");
        diary.editEntry(baseDate, "Dear Diary, today I did some EXTRA coding");
        diary.displayEntries();

        // test remove
        System.out.println("Testing remove");
        diary.removeEntry(baseDate);
        diary.displayEntries();

        // final display
        System.out.println("Final Display");
        diary.addEntry(baseDate, "Dear Diary, today I did some coding");
        diary.displayEntriesFancy();
    }
}
