public class Longest {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No parameters");
        }
        String longest = "";
        int max_len = 0;
        for (String arg : args) {
            if (arg.length() > max_len) {
                max_len = arg.length();
                longest = arg;
            }
        }
        System.out.println("Longest parameter: " + longest);
    }
}