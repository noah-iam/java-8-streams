package factory;

public class Main {
    public static void main(String[] args) {
        Pizza p = Pizza.PizzaFactory.getCheesePizza("cheese", true);
        System.out.println(p);
    }
}

class Pizza {
    String type;
    String falvour;
    Boolean cheese = false;
    Boolean onion = false;
    Boolean capsicum = false;

    private Pizza() {
        this.type = type;
        this.falvour = falvour;
        this.cheese = cheese;
        this.onion = onion;
        this.capsicum = capsicum;
    }
    static class PizzaFactory {
        static Pizza getVegPizza(String type){
            Pizza piz =  new Pizza();
            piz.type = type;
            return piz;
        }

        static Pizza getVegOnionPizza(String type, boolean onion){
            Pizza piz =  new Pizza();
            piz.type = type;
            piz.onion = onion;
            return piz;
        }

        static Pizza getCheesePizza(String type, boolean cheese){
            Pizza piz =  new Pizza();
            piz.type = type;
            piz.cheese = cheese;
            return piz;
        }

    }
    @Override
    public String toString() {
        return "Pizza {" +
                "type='" + type + '\'' +
                ", falvour='" + falvour + '\'' +
                ", cheese=" + cheese +
                ", onion=" + onion +
                ", capsicum=" + capsicum +
                '}';
    }
}




