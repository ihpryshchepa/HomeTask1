public class Name {
    public static void main(String[] args) {
        System.out.println("Number of command line arguments: " + args.length);
        for (String name : args) System.out.println(name);
    }
}
