package classroom._05_11_2019;


class Calculate {
    int calc(String origin) {
        int countOpen= 0;
        int countClose= 0;
                for (int i=0; i < origin.length(); i++) {
                    if(origin.charAt(i)=='(')
                        countOpen++;


                    if(origin.charAt(i)==')')
                        countClose++;

                }
                if (countClose>countOpen) return 15;
                return countClose<countOpen?countClose:countOpen;
    };
}
class CalculateFunction {
    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        System.out.println(calculator.calc("())amid((0))))"));
    }
}