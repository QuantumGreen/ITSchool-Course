package session6_core_API.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        //using String
        String str = "";
        for(int index =0;index<10;index++){
            str += "word"+index+" ";
        }
        System.out.println("Final string using String: \n" + str);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for(int index =0;index<10;index++){
            stringBuilder.append("word");
            stringBuilder.append(index);
            stringBuilder.append(" ");


            // can also do:
            // stringBuilder.append("word").append(index).append(" ");
        }
        System.out.println("Final stringBuilder using StringBuilder: \n" + stringBuilder);

        String name = "john"; //immutable
        name.replace('o', 'a');
        System.out.println(name);
    }
}
