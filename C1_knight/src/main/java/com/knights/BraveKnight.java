/**
 * FileName: BraveKnight
 * Author: nicole
 * Date: 2019/5/5 11:11
 * Description:
 */

package com.knights;/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */

public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
