package com.alexalexanderdev.zennythoughts;

import java.util.Random;

public class QuoteBook {

    // Member variables (properties about the object)
    String[] mQuotes = {
            "cucumber\nunaccountably\ncucumbering",
            "Sometimes the highest form of action is inaction.",
            "The beginning is in the end and the end is in the beginning.",
            "There is no need for temples, no need for complicated philosophy. " +
                    "Our own brain, our own heart is our temple: " +
                    "the philosophy is kindness.",
            "True emptiness is that which transcends all things " +
                    "and yet is imminent in all.",
            "The higher the truth, the simpler it is.",
            "Only the hand that erases can write the true thing.",
            "There is one art, no more, no less. " +
                    "To do all things with artlessness.",
            "The foolish reject what they see, not what they think. " +
                    "The wise reject what they think, not what they see.",
            "Gain is delusion, loss is enlightenment.",
            "Does one really have to fret about enlightenment? " +
                    "No matter what road I travel, I'm going home.",
            "Wise men know that their business is to examine what is, " +
                    "and not to settle what is not.",
            "All questioning is a way of avoiding the real answer, " +
                    "which is really known already.",
            "Man is the only animal for whom his own existence " +
                    "is a problem which he has to solve.",
            "Dying's part of the wheel, right there next to being born. " +
                    "Being part of the whole thing, that's the blessing.",
            "There are more truths in twenty-four hours of a man's life " +
                    "than in all the philosophies.",
            "Knowledge is learning something every day. " +
                    "Wisdom is letting go of something every day.",
            "Truth does not need any explanation. It only needs to be seen.",
            "One can travel the world and see nothing. " +
                    "To achieve understanding, it is necessary not to see many things, " +
                    "but to look hard at what you do see.",
            "Knowing ignorance is strength; ignoring knowledge is sickness.",
            "Don't be too quick to draw conclusions from what happens to you; " +
                    "simply let it happen.",
            "Believe me: life is in the right, always.",
            "Something unknown is doing we-don't-know-what, that is what our knowledge amounts to!",
            "You are something the whole world is doing.",
            "One does what one is; one becomes what one does.",
            "Things are symbols of themselves.",
            "A monk asked Yun-men: 'What is this place where thought is useless?' Yun-men replied: " +
                    "'Thought and emotion cannot fathom it.'",
            "Happiness is a how, not a what; a talent, not an object.",
            "Muddy water is best cleared by leaving it alone.",
            "Autumn wind:\ngods, Buddha--\nlies, lies, lies.",
            "To manage your mind, know that there is nothing, and then relinquish all attachment to the nothingness.",
            "I would rather feel compassion than know the meaning of it.",
            "Open your mouth and you're wrong.",
            "Freedom from the desire for an answer is essential to the understanding of a problem.",
            "Through enlightenment I acquired nothing.",
            "Without leaving my house\nI know the whole universe.",
            "I have discovered that all human evil comes from this, man's being unable to sit still in a room.",
            "The wild geese do not intend to cast\ntheir reflection;\nthe water has no mind to receive\ntheir image.",
            "The first problem for all of us, men and women, is not to learn, but to unlearn.",
            "Act without doing;\nwork without effort.",
            "Look within, thou art the Buddha.",
            "The truth is more important than the facts.",
            "It is only when we realize that life is taking us nowhere that it begins to have meaning.",
            "Only in the present do things happen.",
            "Remember: information is not knowledge; knowledge is not wisdom; wisdom is not truth; " +
                    "truth is not beauty; beauty is not love; love is not music; music is the best.",
            "Sometimes it proves the highest understanding not to understand.",
            "The most beautiful thing in the world is, of course, the world itself.",
            "A man is rich in proportion to the number of things which he can afford to let alone.",
            "The mystery of life is not a problem to be solved but a reality to be experienced.",
            "To live only for some future goal is shallow. It's the sides of the mountain that sustain life," +
                    " not the top.",
            "Know the One.\nLove the All."
    };

    String[] mAuthors = {
            "Paul Reps",
            "Jerry Brown",
            "The Kabbalah",
            "The Dalai Lama",
            "Thomas Merton",
            "Abraham Isaac Kook",
            "Meister Eckhart",
            "Piet Hein",
            "Huang-Po",
            "Uchiyama Roshi",
            "Shinso",
            "Charles Kingsley",
            "Zen saying",
            "Erich Fromm",
            "Natalie Babbitt",
            "Raoul Vaneigem",
            "Zen saying",
            "Steve Hagen",
            "Giorgio Morandi",
            "Lao Tzu",
            "Rainer Maria-Rilke",
            "Rainer Maria-Rilke",
            "Alan Watts",
            "Alan Watts",
            "Robert Musil",
            "Chogyam Trungpa",
            "Zen koan",
            "Herman Hesse",
            "Alan Watts",
            "Shiki",
            "Lao Tzu",
            "St. Thomas Aquinas",
            "Soen Sa Nim",
            "Krishnamurti",
            "The Buddha",
            "Lao Tzu",
            "Blaise Pascal",
            "Zen poem",
            "Gloria Steinem",
            "Lao Tzu",
            "The Buddha",
            "Frank Lloyd Wright",
            "P. D. Ouspensky",
            "Jorge Luis Borges",
            "Frank Zappa",
            "Gracián",
            "Wallace Stevens",
            "Henry David Thoreau",
            "Aart van der Leeuw",
            "Robert M. Pirsig",
            "T'ao-Shan"
    };

    // Methods (abilities/things the object can do)

    // Select a random quote.
        public int getRandomQuoteNumber() {

            Random randomGenerator = new Random();

            return randomGenerator.nextInt(mQuotes.length);
        }

    // Convert the random quote number to a text quote.
    public String getQuote(int randomQuoteNumber) {

        return mQuotes[randomQuoteNumber];
    }

    // Select the author corresponding to the chosen quote and convert to text.
    public String getAuthor(int randomQuoteNumber) {

        return mAuthors[randomQuoteNumber];

    }
}
