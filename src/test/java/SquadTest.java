import models.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly() {
        Squad testSquad = new Squad("developers", 3, "Computer illiteracy");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_Squad() {
        Squad testSquad = new Squad("computernerds", 3, "Computer illiteracy");
        assertEquals("computernerds", testSquad.getName());
    }
    @Test
    public void getSize_Squad() {
        Squad testSquad = new Squad("computernerds", 3, "Computer illiteracy");
        assertEquals(3, testSquad.getSize());
    }
    @Test
    public void getCause_Squad() {
        Squad testSquad = new Squad("computernerds", 3, "Computer illiteracy");
        assertEquals("Computer illiteracy", testSquad.getCause());
    }
    @Test
    public void getId_Squad() {
        Squad.clear();
        Squad testSquad = new Squad("computernerds", 3, "Computer illiteracy");
        assertEquals(1, testSquad.getId());
    }

}
