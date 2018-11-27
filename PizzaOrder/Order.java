class Order {

    // field of order class
    public Pizza arr[];

    public Order(Pizza[] arr) {
        this.arr = arr;
    }

    public void printOrder() {

        System.out.println("3-4-1 PIZZA MADNESS");
        System.out.println("###################");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTopping().equals(arr[i].getBase())) {

                System.out.println("Are you sure you want " + arr[i].getTopping() + " on your " + arr[i].getBase() + " base?");
            } else {

                System.out.println("You ordered a " + arr[i].getTopping() + " on a " + arr[i].getBase() + " base.");
            }

        }
    }
}


