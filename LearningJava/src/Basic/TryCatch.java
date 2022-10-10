package Basic;

public class TryCatch {
		public static void main(String[] args) {
        
        String [] cars = { "Tesla", "Maruti", "Suzuki", "Honda", "Ford" };

        try{
            System.out.println(cars[3]);
            System.out.println(cars[5]);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("MorrisGarage");
    }
}