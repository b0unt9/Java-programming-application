public class GugudanDriver {
    public static void main(String[] args) {
        GugudanInput gi = new GugudanInput();
        Gugudan gugudan = new Gugudan();

        int num = gi.input();
        gugudan.output(num);
    }
}
