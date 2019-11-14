package classroom.factorial;

public class FactApp {
    public int fact(int N){
        if (N==0) return 1;
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        FactApp app = new FactApp();
        int F6 = app.fact(1);
        System.out.println(F6);
    }
}
