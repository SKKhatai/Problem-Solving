//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n=97;
        System.out.println(fun(n));

        }
        static int fun(int n){
        if(n>100){
            return n-8;
        }
        else{
            return fun(fun(n+13));
        }
        }
    }
