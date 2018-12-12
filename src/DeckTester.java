public class DeckTester
{
    public static String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    public static String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public static void main(String[] args)
    {

        Deck D1 = new Deck(ranks, suits, values);
        System.out.println(D1.unDealt);
        System.out.println(D1.unDealt.size());

        System.out.println();

        System.out.println("SHUFFLE");
        D1.shuffle();
        System.out.println(D1.unDealt.size());

        System.out.println();

        System.out.println("DEAL");
        D1.dealAll();
        System.out.println(D1.Dealt);
        System.out.println(D1.Dealt.size());
    }
}
