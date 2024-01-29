public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;
    private boolean doubleMeat = false;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        printBurgerComposition();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        printBurgerComposition();
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayo, Boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        this.doubleMeat = doubleMeat;
        printBurgerComposition();
    }

    private void printBurgerComposition() {
        System.out.println("Склад бургера:");
        System.out.println(bun);
        System.out.println((doubleMeat ? meat + " (подвійна порція)" : meat));
        System.out.println(cheese);
        System.out.println(greens);
        System.out.println((mayo == null ? "без майонезу" : mayo));
        System.out.println();
    }
}
