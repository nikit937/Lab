public class User {
    int res;
    int a;
    int b;
    int c;
    public User(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void result(){
        res=a+b+c;
        System.out.println("Сумма чисел = "+ res);
    }
    }
