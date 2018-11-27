public class PizzaOrder {
    public static void main(String[] args) {

// create an Array that can hold three Pizza objects.
        Pizza[] threeForOne = new Pizza[3];

// create three Pizza objects, with "base" and "topping" and store in array.
        threeForOne[0] = new Pizza("Flour", "Hawaiian");
        threeForOne[1] = new Pizza("Cauliflower", "Pepperoni");
        threeForOne[2] = new Pizza("Broccoli", "Broccoli");

// create Order object and pass Pizza array in as argument
        Order myOrder = new Order(threeForOne);

// print the order according to the output example
        myOrder.printOrder();
    }
}