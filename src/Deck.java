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
        int i = 0;
        while(!unDealt.isEmpty())
        {
            deal(0);
        }
    }

    public void shuffle()
    {
        int i = 0;
        int j = unDealt.size();
        while(i < j)
        {
            int rnd = (int) (Math.random() * unDealt.size());
            unDealt.add(unDealt.get(rnd));
            unDealt.remove(rnd);
            i++;
        }
    }
}
