package com.alexalexanderdev.zennythoughts;

import java.util.concurrent.atomic.AtomicBoolean;

public class ViewSwitcher {
    public void makeSwitchTrue(AtomicBoolean switcher){
        switcher.set(true);
    }
    public void makeSwitchFalse(AtomicBoolean switcher){
        switcher.set(false);
    }
}
