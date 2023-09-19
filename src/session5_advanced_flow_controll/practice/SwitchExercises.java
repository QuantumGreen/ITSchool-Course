package session5_advanced_flow_controll.practice;

public class SwitchExercises {

    public static void main(String[] args) {
        char grade = 'B';
        printGradeInformation(grade);
        printGradeInformationWithEnhancedSwitch(grade);
        printSeasonInfo("Winter");
    }

    private static void printGradeInformation(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognised");
                break;
        }
    }
    private static void printGradeInformationWithEnhancedSwitch(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            default -> System.out.println("Grade not recognised");
        }
    }

    private static void printSeasonInfo(String season){
        switch (season) {
            case "Winter" -> System.out.println("it's cold");
            case "Spring" -> System.out.println("Flowers bloom");
            case "Summer" -> System.out.println("it's warm");
            case "Fall" -> System.out.println("The leafs are falling");
            default -> System.out.println("unknown season");
        }
    }

}
