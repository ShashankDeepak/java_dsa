public class constructors {
    public static void main(String[] args) {
        Numbers n = new Numbers(5);
        
        n.a = 10;
        n.b = 16;
        n.c = 30;

        Numbers n1 = new Numbers(n);
        System.out.println(n1.a + " " + n1.b + " " + n1.c);
    }
}

class Numbers {
    
    int a = 10;
    int b = 16;
    int c = 30;
    Numbers(){
        System.out.println("This is construtor is Default");
    }

    Numbers(int p , int q, int r){
        a = p;
        b = q;
        c = r;
    }

    Numbers(int a){
        System.out.println("This is construtor takes integer");
    }

    Numbers(Numbers n){
        a = n.a; //a = 10
        b = n.b; // b = 16
        c = n.c; //c = 30

        /*  n.a = 10;
        n.b = 16;
        n.c = 30; */
    }

}