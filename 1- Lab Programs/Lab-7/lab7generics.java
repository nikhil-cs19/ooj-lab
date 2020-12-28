class container<T1,T2>{
  T1 a;
  T2 b;
  void display(T1 a,T2 b){
    this.a=a;
    this.b=b;
    System.out.println(this.a+" is "+this.b+" years old.");
  }
}
class generics{
  public static void main(String[] args) {
    container<String,String> c1= new container<>();
    container<String,Integer> c2= new container<>();
    c1.display("Nikhil "," Eighteen");
    c2.display("Nikhil ", 18);
  }
}
