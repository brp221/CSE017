


import java.util.ArrayList;

public class AlexPermutationsK {

  public static void main(String[] args) {
    ArrayList<Character> alphabet = new ArrayList<>();
    for (char i = 'a'; i <= 'z'; i++) {
      alphabet.add(i);
    }

    int numLetters = Integer.parseInt(args[0]);
    int length = Integer.parseInt(args[1]);

    ArrayList<ArrayList<Character>> perms = new ArrayList<>();
    ArrayList<Character> useableLetters = new ArrayList<>();
    for (int i = 0; i < numLetters; i++) {
      Character letter = alphabet.get(i);
      useableLetters.add(letter);
      ArrayList<Character> set = new ArrayList<>();
      set.add(letter);
      perms.add(set);
    }

    ArrayList<ArrayList<Character>> lettersForPerm = new ArrayList<>();
    for (int i = 0; i < numLetters; i++) {
      ArrayList<Character> set = new ArrayList<>(useableLetters);
      set.remove(i);
      lettersForPerm.add(set);
    }

    for (Character c : useableLetters) {
      System.out.print(c);
    }
    System.out.println();

    for (int i = 0; i < perms.size(); i++) {
      ArrayList<Character> perm = perms.get(i);
      ArrayList<Character> letters = lettersForPerm.get(i);
      permutations(perm,letters,length);
    }
  }

  public static void permutations(ArrayList<Character> perm, ArrayList<Character> charLeft, int max) {
    if (perm.size() < max) {
      int size = charLeft.size();
      for (int i = 0; i < size; i++) {
        ArrayList<Character> updatedCharLeft = new ArrayList<>(charLeft);
        ArrayList<Character> updatedPerm = new ArrayList<>(perm);
        Character c = updatedCharLeft.get(i);
        updatedCharLeft.remove(i);
        updatedPerm.add(c);
        permutations(updatedPerm, updatedCharLeft, max);
      }
      return;
    }

    for (int i = 0; i < perm.size(); i++) {
      System.out.print(perm.get(i));
    }
    System.out.println();
  }
}