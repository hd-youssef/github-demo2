import java.util.ArrayList;
public class ArrayesListesWorks{


   public static void main(String[]args){



   }

   public static ArrayList<Integer> combinations(ArrayList<Integer> a, ArrayList<Integer> b){


	   ArrayList<Integer> combine = new ArrayList<>();

	   for(int i=0; i<a.size(); i++){

		   combine.add(a.get(i));
	   }

	   for(int i=0; i<b.size(); i++){

		   combine.add(b.get(i));
	   }

	   return combine;

   }

   public static void relaysInfo(ArrayList<Integer> y){




	   for(int i=0; i<y.size(); i++){
		   System.out.print(y.get(i)+" , ");
	   }

	   System.out.println();



   }
}