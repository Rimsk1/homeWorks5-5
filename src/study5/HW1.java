package study5;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        String courseName = "Курс Java Junior Developer";
        courseName = courseName.replace("Java", "Python");
        System.out.println(courseName);

        courseName = "Курс Java Junior Developer";
        courseName = courseName.replaceAll( "\\s" ,"_");
        System.out.println(courseName);

        String namesStr = "Kotlin, Java, Python";
        String[] names = namesStr.split(", ");
        System.out.println(Arrays.toString(names));

        namesStr = String.join("! ", names);
        System.out.println(namesStr);


        String userName = "Roman";
        String userSurname = "Safarov";

        String concatStr = userName + " :: " + userSurname;
        System.out.println(concatStr);

        concatStr = userName.concat(" :: ").concat(userSurname);
        System.out.println(concatStr);

         concatStr = String.join(" :: ", userName, userSurname );
        System.out.println(concatStr);

        String str2 = "Begin";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        for (int i =0; i<1000; i++) {
            sb.append(" Промежуток ").append(i).append(" ");
        }
        sb.append("Окончание");
        System.out.println(sb.toString());
    }
}
