import java.io.*;
public class CharacterManagement {
    public static void serializeCharacter(Character character, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(character);
        } catch (IOException e) {
            System.err.println("Loi");
        }
    }
    public static Character deserializeCharacter(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Character) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Loi");
            return null;
        }
    }
    public static void action(Character character) {
        if ("Warrior".equals(character.getName())) {
            character.setScore(character.getScore() + 100);
        }
    }
}
