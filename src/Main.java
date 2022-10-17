public class Main {
    public static void main(String[] args) {
        var dog = 8D;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Task2");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Task3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
}