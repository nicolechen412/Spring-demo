/**
 * FileName: Minstrel
 * Author: nicole
 * Date: 2019/5/6 14:41
 * Description:
 */

package com.knights;/*
 * author: nicole
 * date: 2019/5/6
 * desc:
 */

import java.io.PrintStream;

public class Minstrel {

    PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("The knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("The brave knight did embark on a quest!");
    }
}
