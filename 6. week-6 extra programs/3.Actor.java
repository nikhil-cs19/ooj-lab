// Develop a Java program to create a class Actor with id, name, no_of_movies,
// no_of_years_exp. Calculate the average_performance for each of the actor and print
// the name of the actor with highest average.
import java.util.*;
class temp{
	String id,name;
	double no_of_movies,years_of_exp;
	double avg;
	static double highest_avg;
	void Accept() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id and name of an actor");
		id = in.next();
		name=in.next();
		System.out.println("Enter no of movies and years of experience");
		no_of_movies=in.nextDouble();
		years_of_exp=in.nextDouble();
	}
	void Average() {
		avg=no_of_movies/years_of_exp;
		System.out.println(name+" average performence is "+avg+" movies per year");
	}
}
public class Actor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no_of_actors;
		String nam="";
		double high=0.0;
		System.out.println("no of actors");
		no_of_actors=in.nextInt();
		temp[] a = new temp[no_of_actors];
		for(int i=0;i<no_of_actors;i++) {
			a[i]=new temp();
			a[i].Accept();
			a[i].Average();
		}
		for(int i=0;i<no_of_actors;i++) {
			if(a[i].avg>high) {
				high=a[i].avg;
				nam=a[i].name;
				temp.highest_avg=high;
			}
		}
		System.out.println(nam+" is having high average performence with "+temp.highest_avg+" movies per year");
	}

}
