import java.util.Scanner;

public class PetTests {
    public static void moreInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the pet: ");
        String pname = input.next();

        System.out.print("Please enter the breed of the pet: ");
        String pbreed = input.next();

        System.out.print("Please enter the age of the pet: ");
        int page = input.nextInt();

        Pets newPet = new Pets(pname, pbreed, page);

        newPet.setName(pname);
        System.out.println("Name: " + newPet.getName());

        newPet.setAge(page);
        System.out.println("Age: " + newPet.getBreed());

        newPet.setBreed(pbreed);
        System.out.println("Breed: " + newPet.getAge());

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the pet: ");
        String pname = input.next();

        System.out.print("Please enter the breed of the pet: ");
        String pbreed = input.next();

        System.out.print("Please enter the age of the pet: ");
        int page = input.nextInt();

        Pets newPet = new Pets(pname, pbreed, page);

        newPet.setName(pname);
        System.out.println("Name: " + newPet.getName());

        newPet.setAge(page);
        System.out.println("Age: " + newPet.getBreed());

        newPet.setBreed(pbreed);
        System.out.println("Breed: " + newPet.getAge());


        System.out.print ("Would you like to enter another the information of another pet? (yes or no)");
        String answer = input.next();

        while (answer.equals("yes")){
            moreInfo();
            System.out.print ("Would you like to enter another the information of another pet? (yes or no)");
            answer = input.next();

        }
        System.out.println("Thanks for using the Pet service info center");
    }
}