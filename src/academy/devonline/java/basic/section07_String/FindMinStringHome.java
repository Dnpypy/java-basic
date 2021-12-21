package academy.devonline.java.basic.section07_String;

public class FindMinStringHome {
    public static void main(String[] args) {

        // read source data
        String[] nums = {"five", "one", "two", "three", "four"};

        //processing
        var minStr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i].compareTo(minStr) < 0) {
                minStr = nums[i];
            }
        }

        // display results
        System.out.println(minStr);

    }
}
