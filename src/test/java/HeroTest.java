import models.Hero;
import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly() {
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void getName_Hero() {
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals("batman", myHero.getName());
    }

    @Test
    public void getAge_Hero() {
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals(20, myHero.getAge());
    }
    @Test
    public void getPower_Hero() {
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals("teleportation", myHero.getPower());
    }
    @Test
    public void getWeakness_Hero() {
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals("anger", myHero.getWeakness());
    }
    @Test
    public void getId_Hero() {
        Hero.clear();
        Hero myHero = new Hero("batman",20,"teleportation","anger");
        assertEquals(1, myHero.getId());
    }
}
