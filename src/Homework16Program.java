public class Homework16Program {
    public static void main(String[] args) {
        Burger ordinaryBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез", true);
    }
}
