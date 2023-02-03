package Week1.Day1;
public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Welcome to CS220 Class!");
        System.out.println("Programming is fun!");
        int i = Integer.MAX_VALUE;
        int j = i + 1;
        System.out.println(j);
        System.out.println(5.6 + 5.8);

        //Variables and number literals
        int a = 3;
        int b = (int) 3.0;
        String s = "200";
        int c = Integer.parseInt(s);
        double d = Double.parseDouble(s);
        Integer e = Integer.valueOf(s);
        String s2 = Integer.toString(a);

        System.out.printf("%d%5d\t%s%10d % .2f % d %s%n", a,b,s,c,d,e,s2);
    }
}
