package com.alexalexanderdev.zennythoughts;

import java.util.Random;

public class MandalaBook {

    // Member variables (properties about the object)
    int[] mMandalas = {
            R.drawable.doodle1,
            R.drawable.doodle2,
            R.drawable.doodle3,
            R.drawable.doodle4,
            R.drawable.doodle5,
            R.drawable.doodle6
    };

    // Methods (abilities/things the object can do)
    public int getMandala() {

        int mandala;

        // Select a random mandala.
        Random randomGenerator = new Random();
        int randomMandalaNumber = randomGenerator.nextInt(mMandalas.length);

        // Convert mandala to int.
        mandala = mMandalas[randomMandalaNumber];

        return mandala;

    }

}
