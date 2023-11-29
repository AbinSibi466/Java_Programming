class Inheritance1 {
    String a = "KGF";

    void Onemovie(String a){
        System.out.println(a);
    }
}
class Inheritance2 extends Inheritance1{
    Inheritance1 i = new Inheritance1();
    Inheritance2 i2 = new Inheritance2();
    void Twomovie(){
      i.Onemovie(i.a);
      i2.Onemovie(a);
    }

    public static void main(){
    Inheritance2 i2 = new Inheritance2();
    i2.Twomovie();
}
}

