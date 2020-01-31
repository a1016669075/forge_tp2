import java.util.Scanner;

public class Calcul {
	public static void main(String[] args) {
		Calcul ca = new Calcul();
		ca.cacul();
	}
	void cacul() {
		System.out.println("Quelle est la distance parcourue?");
		Scanner in = new Scanner(System.in);
		
		int distance = in.nextInt();
		double rembourses = 0.0;
		if(distance <= 10) {
			rembourses = distance * 1.5;
		}else if(distance >10 && distance <=39) {
			rembourses = 10 * 1.5 + (distance - 10)*0.4;
		}else if(distance >=40&&distance<=60 ) {
			rembourses = 10*1.5 + 30*0.4 + (distance-40)*0.55;
		}else if(distance >60&&distance <80) {
			rembourses = 10*1.5 + 30*0.4 + 20*0.55 + 6.81;
		}
		else{
			rembourses = 10*1.5 + 30*0.4 + 20*0.55 + ((distance/20)-3)*6.81;
		}
        System.out.println("vous pouvez obtenir:"+rembourses+"Euros");
       
	}

}
