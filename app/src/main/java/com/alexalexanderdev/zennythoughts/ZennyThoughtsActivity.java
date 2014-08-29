package com.alexalexanderdev.zennythoughts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicBoolean;

public class ZennyThoughtsActivity extends Activity {

    private QuoteBook mQuoteBook = new QuoteBook();
    private MandalaBook mMandalaBook = new MandalaBook();
    private AtomicBoolean viewSwitch = new AtomicBoolean(false);
    private ViewSwitcher mViewSwitcher = new ViewSwitcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zenny_thoughts);

        final AutoResizeTextView mQuoteTextView = (AutoResizeTextView) findViewById(R.id.quoteTextView);
        final AutoResizeTextView mNewQuoteTextView = (AutoResizeTextView) findViewById(R.id.newQuoteTextView);
        final TextView mAuthorTextView = (TextView) findViewById(R.id.authorTextView);
        final TextView mNewAuthorTextView = (TextView) findViewById(R.id.newAuthorTextView);
        final ImageView mMandalaImageView = (ImageView) findViewById(R.id.mandalaImageView);
        final ImageView mNewMandalaImageView = (ImageView) findViewById(R.id.newMandalaImageView);
        Button moreZenButton = (Button) findViewById(R.id.moreZenButtonView);



        // Initially hide "new quote" and "new author" TextViews, and "new mandala" ImageView.
        mNewQuoteTextView.setVisibility(View.GONE);
        mNewAuthorTextView.setVisibility(View.GONE);
        mNewMandalaImageView.setVisibility(View.GONE);

        // Retrieve and cache the system's default "long" animation time.
        final int mAnimationDuration = getResources().getInteger(
                android.R.integer.config_longAnimTime);

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get random quote number.
                int quoteNumber = mQuoteBook.getRandomQuoteNumber();

                if (!viewSwitch.get()) {

                    // Display random quote in "new quote" TextView.
                    String quote = mQuoteBook.getQuote(quoteNumber);
                    mNewQuoteTextView.setText(quote);

                    //Display corresponding author in "new author" TextView.
                    String author = mQuoteBook.getAuthor(quoteNumber);
                    mNewAuthorTextView.setText(author);

                    // Display random mandala in "new mandala" ImageView.
                    int mandala = mMandalaBook.getMandala();
                    mNewMandalaImageView.setImageResource(mandala);

                    // Set "new quote" and "new author" TextViews and "new mandala" ImageView
                    // to visible but transparent.
                    mNewQuoteTextView.setAlpha(0f);
                    mNewQuoteTextView.setVisibility(View.VISIBLE);
                    mNewAuthorTextView.setAlpha(0f);
                    mNewAuthorTextView.setVisibility(View.VISIBLE);
                    mNewMandalaImageView.setAlpha(0f);
                    mNewMandalaImageView.setVisibility(View.VISIBLE);

                    // Animate "new quote" and "new author" and "new mandala" alpha to 100%.
                    mNewQuoteTextView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);
                    mNewAuthorTextView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);
                    mNewMandalaImageView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);

                    // Animate original quote and author TextViews and mandala ImageView to 0% alpha,
                    // and set final visibility to GONE.
                    mQuoteTextView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mQuoteTextView.setVisibility(View.GONE);

                                }
                            });

                    mAuthorTextView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mAuthorTextView.setVisibility(View.GONE);
                                }
                            });

                    mMandalaImageView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mMandalaImageView.setVisibility(View.GONE);
                                }
                            });

                    // Change viewSwitch to "true" so that next click will trigger opposite animation.
                    mViewSwitcher.makeSwitchTrue(viewSwitch);

                }

                else if (viewSwitch.get()) {

                    // Display random quote in old quote TextView.
                    String quote = mQuoteBook.getQuote(quoteNumber);
                    mQuoteTextView.setText(quote);

                    //Display corresponding author in old author TextView.
                    String author = mQuoteBook.getAuthor(quoteNumber);
                    mAuthorTextView.setText(author);

                    // Display random mandala in old mandala ImageView.
                    int mandala = mMandalaBook.getMandala();
                    mMandalaImageView.setImageResource(mandala);

                    // Set old quote and author text views to visible but transparent.
                    mQuoteTextView.setAlpha(0f);
                    mQuoteTextView.setVisibility(View.VISIBLE);
                    mAuthorTextView.setAlpha(0f);
                    mAuthorTextView.setVisibility(View.VISIBLE);
                    mMandalaImageView.setAlpha(0f);
                    mMandalaImageView.setVisibility(View.VISIBLE);

                    // Animate old quote and author and mandala alpha to 100%.
                    mQuoteTextView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);
                    mAuthorTextView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);
                    mMandalaImageView.animate()
                            .alpha(1f)
                            .setDuration(mAnimationDuration)
                            .setListener(null);

                    // Animate "new quote" and "new author" TextViews and "new mandala" ImageView
                    // to 0% alpha, and set final visibility to GONE.
                    mNewQuoteTextView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mNewQuoteTextView.setVisibility(View.GONE);

                                }
                            });
                    mNewAuthorTextView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mNewAuthorTextView.setVisibility(View.GONE);
                                }
                            });
                    mNewMandalaImageView.animate()
                            .alpha(0f)
                            .setDuration(mAnimationDuration)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    mNewMandalaImageView.setVisibility(View.GONE);
                                }
                            });

                    // Change viewSwitch to "false" so that next click will trigger opposite animation.
                    mViewSwitcher.makeSwitchFalse(viewSwitch);

                }

            }
        };
        moreZenButton.setOnClickListener(listener);
    }
}
