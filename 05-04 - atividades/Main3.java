public class Main3 {
    int a;
    booelan b;
    private Main3() {
        a = 0;
        b = false;
    }
    public static void main3(String[] args) {
        Main obj = new Main();
        System.out.println("Valores padrão");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
