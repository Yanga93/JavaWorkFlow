class Pizza {

    // fields of pizza class
    private String base;
    private String topping;

    // set the  constructor method
    public Pizza(String base, String topping) {
        this.base = base;
        this.topping = topping;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

}