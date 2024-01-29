public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger() {
        this.bun = "звичайна булочка";
        this.meat = "звичайне м'ясо";
        this.cheese = "звичайний сир";
        this.greens = "звичайна зелень";
        this.mayo = "звичайний майонез";
        printBurgerComposition();
    }

    public Burger(boolean isDiet) {
        this.bun = "дієтична булочка";
        this.meat = "дієтичне м'ясо";
        this.cheese = "дієтичний сир";
        this.greens = "дієтична зелень";
        if (isDiet) {
            this.mayo = "без майонезу";
        } else {
            this.mayo = "звичайний майонез";
        }
        printBurgerComposition();
    }

    public Burger(int doubleMeat) {
        this.bun = "звичайна булочка";
        this.meat = "подвійне м'ясо";
        this.cheese = "звичайний сир";
        this.greens = "звичайна зелень";
        this.mayo = "звичайний майонез";
        printBurgerComposition();
    }

    private void printBurgerComposition() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayo);
        System.out.println();
    }
}
