

public class Sentence_rev {

    public static void main(String[] args) {

        String str = "hello my name is sauraqv kumar arya";
        String arr[] = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
