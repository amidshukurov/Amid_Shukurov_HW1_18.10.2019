package classroom;

public class SplitString {

    public static String gen_random(int length) {
        int range = 'Z' - 'A' + 1;
        String outcome = "";
        for (int i = 0; i < length; i++) {
            boolean way = (int)((Math.random()*100))%2==0;
//      char c = (char) (Math.random()*range + (way ? 'A' : 'a'));
            char c = (char) (Math.random()*range + 'A');
            if (way) {
                c = Character.toLowerCase(c);
            }
            outcome = outcome + c;
        }
        return outcome;
    };
    public class Result {
        public String getOrigin() {
            return origin;
        }

        public String getUpperConstant() {
            return upperConstant;
        }

        public String getUpperVowels() {
            return upperVowels;
        }

        public String getLowerConstant() {
            return lowerConstant;
        }

        public String getLowerVowels() {
            return lowerVowels;
        }

        private final String origin;
        private final String upperConstant;
        private final String upperVowels;
        private final String lowerConstant;
        private final String lowerVowels;

        public Result(String origin, String upperConstant, String upperVowels, String lowerConstant, String lowerVowels) {
            this.origin = origin;
            this.upperConstant = upperConstant;
            this.upperVowels = upperVowels;
            this.lowerConstant = lowerConstant;
            this.lowerVowels = lowerVowels;
        }

    }

    public boolean isUpper(char c){
        return c>='A' &&c<'Z';
    }
    public boolean isLower(char c){
        return c>='a' &&c<'z';
    }
    public boolean isVowel(char c){
        char upper = Character.toLowerCase(c);
        return upper=='a' ||upper=='e'||upper=='o'||upper=='u'||upper=='i';
    }
    public boolean isConstant(char c){
        return !isVowel(c);
    }

    public boolean isUpperConstant(char c){
        return isUpper(c)&&isConstant(c);
    }
    public boolean isUpperVowel(char c){
        return isUpper(c)&&isVowel(c);
    }
    public boolean isLowerConstant(char c){
        return isLower(c)&&isConstant(c);
    }
    public boolean isLowerVowel(char c){
        return isLower(c)&&isVowel(c);
    }

    public Result process(String origin){
/*      String uc="";
        String lc="";
        String uv="";
        String lv="";*/
        StringBuilder uc = new StringBuilder();
        StringBuilder lc = new StringBuilder();
        StringBuilder uv = new StringBuilder();
        StringBuilder lv = new StringBuilder();
        for (int i=0;i<origin.length();i++){
            char c = origin.charAt(i);
            if (isUpperConstant(c)){
                uc.append(c);
            } else if (isUpperVowel(c)) {
                uc.append(c);
            } else if (isLowerConstant(c)) {
                uc.append(c);
            } else if (isLowerVowel(c)) {
                uc.append(c);
            }
        }
        return new Result(origin,
                uc.toString(),
                uv.toString(),
                lc.toString(),
                lv.toString());
    }
    private void print(Result result){
        System.out.printf("Origin: %s\nUC: %s\nUV: %s\nLC: %s\nLV: %s\n",
                result.getOrigin(),
                result.getUpperConstant(),
                result.getUpperVowels(),
                result.getLowerConstant(),
                result.getLowerVowels()
        );
    }
    public static void main(String[] args) {
        String origin = gen_random(10);
        SplitString app = new SplitString();
        Result result = app.process(origin);
        app.print(result);

    }

}
