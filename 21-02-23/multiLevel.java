import java.util.Scanner;
class plate{
    double length,width;
    plate(double a,double b){
        this.length=a;
        this.width=b;

    }
    void dimensionPlate(){
        System.out.println("Length: "+length+" Width: "+width);
    }
}
class box extends plate{
    double height;
    box(double a,double b,double c){
        super(a,b);
        this.height=c;

    }
    void dimensionBox(){
        System.out.println("Length: "+length+" Width: "+width+" Height:"+height);
    }
}
class woodbox extends box{
    double thick;
    woodbox(double a,double b,double c,double d){
        super(a,b,c);
        this.thick=d;

    }
    void dimensionWoodbox(){
        System.out.println("Length: "+length+" Width: "+width+" Height:"+height+" Thick: "+thick);
    }
}
public class multiLevel {
    public static void main(String[] args){
        // woodbox wd=new woodbox(7, 8, 4, 2);
        box b=new box(9, 4, 6);
        plate p=new plate(12, 10);
        woodbox wd=new woodbox(7, 8, 4, 2);
        p.dimensionPlate();
        b.dimensionBox();
        wd.dimensionWoodbox();
    }
}
