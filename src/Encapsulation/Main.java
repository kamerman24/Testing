package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Kyle";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 50;
//        player.loseHealth(damage);
//        System.out.println("Player currently has " + player.healthRemaining() + " health remaining");

        EnhancedPlayer player = new EnhancedPlayer("Kyle", 90, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
        player.loseHealth(50);
        System.out.println(player.getHitPoints());

        Printer printer = new Printer(100, true);

        printer.print(50);
        System.out.println("Toner level: " +printer.getTonerLevel());
        printer.addToner(40);
        System.out.println("Toner level: " + printer.getTonerLevel());

    }
}
