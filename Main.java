public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 20, "MAGIC ATTACK");
        heroes[1] = new Medic(80, 10, "HEALING", 50);
        heroes[2] = new Warrior(120, 25, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println("Medic's new heal points: " + ((Medic) hero).getHealPoints());
            }
        }
    }
}