package encapsulation.assignment_problems;

public class Character {
    private final int maxHealth;
    private int health;

    public Character(int maxHealth) {
        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Maximum health must be positive.");
        }

        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }

        health = (int) Math.max(0L, (long) health - amount);
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Healing cannot be negative.");
        }

        health = (int) Math.min(maxHealth, (long) health + amount);
    }

    public int getHealth() {
        return health;
    }
}