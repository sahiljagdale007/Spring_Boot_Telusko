public class basics {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        for(int i=0; i<=15; i++) {
            System.out.println("I love you");
        }
        int i = 1;
        while(i<=5) {
            System.out.println("hello world");
            i++;
        }
        int cond = 15;
        int res = 0;
        res = cond>res ? 10 : 15;
        System.out.println(res);
    }
}