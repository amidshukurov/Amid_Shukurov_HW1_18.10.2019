package athomepractise.classdeclaration;

class Test {
    int a,b;

    Test(int i, int j) {
        this.a=i;
        this.b=j;
    }

    Test() {

    }

    void change (Test ob){
        ob.a=ob.a+ob.b;
        ob.b=-ob.b;
    }

}
class PassOfReference{
    public static void main(String[] args) {
        Test ob = new Test();
//        System.out.println(ob.a+" "+ ob.b);
//        Test aa = new Test(20,30);
//        System.out.println(aa.a+" "+ aa.b);
//        ob.change(aa);
//        System.out.println(ob.a+" "+ ob.b);
//        System.out.println(aa.a+" "+ aa.b);
    }
}
