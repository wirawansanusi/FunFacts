package com.wirawansanusi.funfacts.model;

/**
 * Created by wirawansanusi on 11/1/15.
 */
public class FunFacts {

    private String[] mFacts;

    public FunFacts() {

        String[] facts = {
                "Google's founders were willing to sell to Excite for under $1 million in 1999—but Excite turned them down",
                "There was a third Apple founder. Ronald Wayne (pictured at home in 2010) sold his 10% stake for $800 in 1976",
                "The famous Aaron Burr “Got Milk?” ad from 1993 was directed by Michael Bay",
                "According to Amazon, the most highlighted Kindle books are the Bible, the Steve Jobs biography, and The Hunger Games",
                "A California woman once tried to sue the makers of Cap'n Crunch because Crunch Berries contained no berries of any kind",
                "Wilford Brimley was Howard Hughes's bodyguard",
                "During WWI, German measles were called \"liberty measles\" and dachshunds became \"liberty hounds",
                "In a 2008 survey, 58% of British teens thought Sherlock Holmes was a real guy, while 20% thought Winston Churchill was not",
                "At one point in the 1990s, 50% of all CDs produced worldwide were for AOL",
                "Toy companies failed to duplicate the success of Theodore Roosevelt's teddy bear with William Taft's \"Billy Possum",
                "Nutella was invented during WWII, when an Italian pastry maker mixed hazelnuts into chocolate to extend his chocolate ration",
                "For more facts, visit http://mentalfloss.com/article/52275/65-amazing-facts-will-blow-your-mind"
        };
        mFacts = facts;
    }

    public String getFact(int factNumber) {

        return mFacts[factNumber];
    }

    public int getTotalFact() {

        return mFacts.length;
    }
}
