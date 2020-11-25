
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Toy> toys = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>(); 
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            
            
            Toy toy = new Toy(identifier, name);
            
            if (id.contains(identifier)){
                
            } else {
                id.add(identifier);
             
                if (toys.contains(toy)){
                
                } else {
                    toys.add(toy);
                }
            }
            
    }
        
        System.out.println("==Items==");
        
        for (int i = 0; i<toys.size(); i++){
           
            System.out.println(toys.get(i));
        }
        
            
    }
}
