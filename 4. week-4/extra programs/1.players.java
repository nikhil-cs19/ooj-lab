import java.util.*;
class play{
  String id,name;
  int matches_played;
  double total=0,avg=0;
  double scores[];
  void getdetails(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter name and id of a player");
    name=in.next();
    id=in.next();
    System.out.println("Enter no of matches played");
    matches_played=in.nextInt();
    scores = new double[matches_played];
    for(int i=0;i<matches_played;i++){
      System.out.println("Enter score of match "+(i+1));
      scores[i]=in.nextInt();
    }
  }
double average(){
  for(int i=0;i<matches_played;i++){
    total+=scores[i];
  }
  avg=(total/matches_played);
  System.out.println("average score is "+avg);
  return avg;
}

}
class players{
   public static void main(String[] args) {
    play p1 = new play();
    play p2 = new play();
    p1.getdetails();
    double a=p1.average();
    p2.getdetails();
    double b=p2.average();
    if(a>b){
      System.out.println(p1.name + " has high average score");
    }
    else if(a==b){
      System.out.println("Both the averages are equal");
    }
    else{
      System.out.println(p2.name + " has high average score");
    }
  }
}
