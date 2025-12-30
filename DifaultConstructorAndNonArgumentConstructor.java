public class DifaultConstructorAndNonArgumentConstructor {
    int x;
    int y;
    DifaultConstructorAndNonArgumentConstructor(){
        x=100;
        y=200;
    }
        void show(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String []args){
        DifaultConstructorAndNonArgumentConstructor d=new DifaultConstructorAndNonArgumentConstructor();
        d.show();
    }
}
