public class Test {
    public static void main(String[] args) {
        //Последовательность Фибоначчи с помощью цикла for
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 3; i <= 15; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

