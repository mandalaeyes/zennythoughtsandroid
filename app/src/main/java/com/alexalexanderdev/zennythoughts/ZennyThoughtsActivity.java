package com.alexalexanderdev.zennythoughts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class ZennyThoughtsActivity extends Activity {

    private QuoteBook mQuoteBook = new QuoteBook();
    private MandalaBook mMandalaBook = new MandalaBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zenny_thoughts);

        final AutoResizeTextView quoteTextView = (AutoResizeTextView) findViewById(R.id.quoteTextView);
        final TextView authorTextView = (TextView) findViewById(R.id.authorTextView);
        final ImageView mandalaImageView = (ImageView) findViewById(R.id.mandalaImageView);
        Button moreZenButton = (Button) findViewById(R.id.moreZenButtonView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get random quote number.
                int quoteNumber = mQuoteBook.getRandomQuoteNumber();

                // Display random quote.
                String quote = mQuoteBook.getQuote(quoteNumber);
                quoteTextView.setText(quote);

                //Display corresponding author.
                String author = mQuoteBook.getAuthor(quoteNumber);
                authorTextView.setText(author);

                // Display random mandala.
                int mandala = mMandalaBook.getMandala();
                mandalaImageView.setImageResource(mandala);
            }
        };
        moreZenButton.setOnClickListener(listener);
    }
}
