package test.java.interview_tasks.string_tasks;

public class String_ReturnDuplicatedChars {
    /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
     */
    public static void main(String[] args) {
        String str = "inteerrrviiew";
        String result = "";
        String[] arr = str.split("");
        for (String each:arr) {
            int count = 0;
            for (String each1:arr) {
                if (each.equals(each1)) {
                    count++;
                }
            }
            if (count >= 2 && !result.contains(each)) {
                result+=each;
            }
        }
        System.out.println(result);
    }
}
