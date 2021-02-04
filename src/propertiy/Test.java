package propertiy;

/*
    Created on 2020/11/20
*/
public class Test {
    public static void main(String[] args) {
        Test1<String> t = new Test1<>("aaa");
        t.print();
    }

}
class Test1<T>{
    private T s;

    public Test1(T s) {
        this.s = s;
    }
    public void print(){
        System.out.println(s);
    }
}