import java.util.ArrayList;

public class Deck
{
    ArrayList<Card> unDealt = new ArrayList<Card>();
    ArrayList<Card> Dealt = new ArrayList<Card>();

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        int i = 0;
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                unDealt.add(new Card(rank, suit, values[i]));
                i++;
            }
            i = 0;
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

    public void dealAll()
    {
        for(int i = 0; i < unDealt.size(); i++)
        {
            Dealt.add(unDealt.get(i));
            unDealt.remove(i);
        }
    }

    public void shuffle()
    {
        unDealt.addAll(Dealt);
        Dealt.removeAll(Dealt);
        for(int i = 0; i < unDealt.size() - 1; i++)
        {
            int rnd = (int) (Math.random() * unDealt.size() - 1);
            int rnd2 = (int) (Math.random() * unDealt.size() - 1);
            Card tmp = unDealt.get(rnd);
            Card tmp2 = unDealt.get(rnd2);
            unDealt.remove(rnd);
            unDealt.remove(rnd2);
            unDealt.set(rnd2, tmp);
            unDealt.set(rnd, tmp2);
        }
    }
}
