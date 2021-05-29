package oop.example;


public class App 
{
    public static void main( String[] args )
    {
        Party userPizzaParty = new Party();
        int userPeople = userPizzaParty.getPeople();
        double userPizza = userPizzaParty.getPizza();
        int userSlices = userPizzaParty.getSlices();
        int [] userPieces = userPizzaParty.pizzaDivide();

        System.out.println("How many people? "+userPeople);
        System.out.println("How many pizzas do you have? "+userPizza);
        System.out.printf("Your pizzas have %d slices per pizza.%n", userSlices);
        System.out.printf("%d people with %.2f pizzas%n", userPeople, userPizza);
        System.out.printf("Each person gets %d pieces of pizza.%n", userPieces[0]);
        System.out.printf("There are %d leftover pieces.%n",userPieces[1]);

    }
}
