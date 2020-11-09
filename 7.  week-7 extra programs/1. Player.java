/*Develop a Java program to create a class PLAYER with member variables name,
matches_played and average. This class has an abstract method cal_average(String,int,int).
Derive two classes BATSMAN and BOWLER from PLAYER. Class BATSMAN has a
member variable runs_scored. Class BOWLER has a member variable runs_given. Create m
BATSMAN objects and n BOWLER objects. Calculate and display the average runs scored
by each BATSMAN and average runs given by each BOWLER.*/
class player{
  String name;
  int matches_played=0;
  double average=0.0;
  }
class Batsman extends player {
  int runs_scored;
  double average;
  void cal_average(String name,int matches_played,int runs_scored){
    average=(double)runs_scored/matches_played;
    System.out.println(average);
  }
}
class Play{
  public static void main(String[] args) {
    Batsman b =new Batsman();
    b.cal_average("nikhil",11,324);
  }
}
