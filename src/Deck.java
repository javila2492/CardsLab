import java.util.ArrayList;

public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                for (int value : values)
                    unDealt.add(new Card(rank, suit, value));
            }
        }
    }

    public boolean isEmpty()
    {
        return unDealt.size() == 0;
    }

    public void deal(int a)
    {
        Dealt.add(unDealt.get(a));
        unDealt.remove(a);
    }

    public void shuffle()
    {
        unDealt.addAll(Dealt);
        Dealt.removeAll(Dealt);
        for(int i = 0; i < unDealt.size(); i++)
        {
            int rnd = (int) (Math.random() * unDealt.size());
            int rnd2 = (int) (Math.random() * unDealt.size());
            Card tmp = unDealt.get(rnd);
            Card tmp2 = unDealt.get(rnd);
            unDealt.remove(rnd);
            unDealt.set(rnd2, tmp);
            unDealt.remove(rnd);
            unDealt.set(rnd2, tmp);
        }
    }
}
