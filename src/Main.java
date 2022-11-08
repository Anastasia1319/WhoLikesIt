public class Main {
    public static void main(String[] args) {
        System.out.println(WhoLikesIt.whoLikesIt());
        System.out.println(WhoLikesIt.whoLikesIt("Peter"));
        System.out.println(WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        System.out.println(WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        System.out.println(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}