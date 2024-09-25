public class OutputPractice {
    public static void main(String[] args) {
        int age = 25;
        String hobby = "자는게 너무 좋아!";
        String name = "김선혁";

        System.out.println(name + "(" + age + "세) " + hobby);

        System.out.print(name);
        System.out.print("(");
        System.out.print(age);
        System.out.print("세) ");
        System.out.print(hobby);
    }
}