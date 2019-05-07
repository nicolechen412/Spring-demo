/**
 * FileName: SlayDragonKnight
 * Author: nicole
 * Date: 2019/5/5 11:26
 * Description:
 */

package com.knights;/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

    public PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        System.out.println("Embarking on quest to slay the dragon!");
    }
}
