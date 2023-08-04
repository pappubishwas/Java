class abc
{
    int i,j,k;
    void getc(int p,int q,int r){
        i=p;
        j=i+q-2;
        k=i+j+r;
    }
    void display(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    void f1(abc t){
        t.i=t.i+1;
        t.j=t.j+2;
        t.k=t.k+3;
    }
}

public class complate {
    public static void main(String[] args) {
        abc a2=new abc();    
        abc a1=new abc();
            // abc a2=new abc();
            a1.getc(10,20,30);
            a1.display();
            a2.f1(a1);
            a2.display();
            
        }
}
