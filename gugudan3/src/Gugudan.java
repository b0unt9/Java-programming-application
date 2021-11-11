public class Gugudan {
    /**
     * 단를 입력 받아서 구구단 출력
     * @param num 단
     */
    public void output (int num) {
        for (int i = 1; i < 10; ++i) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
    
}
