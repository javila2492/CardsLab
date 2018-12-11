public class Card
{
    String rank;
    String suit;
    int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank()
    {
        return rank;
    }

    public String suit()
    {
        return suit;
    }

    public int pointValue()
    {
        return pointValue;
    }

    public boolean equals(Card otherCard)
    {
        return rank.equals(otherCard.rank) && suit.equals(otherCard.suit) && pointValue == otherCard.pointValue;
    }

    public String toString()
    {
        return rank + " of " + suit + ": " + pointValue + " point(s)";
    }
}
