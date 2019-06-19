/**
 * FileName: DamselRescuingKnight
 * Author: nicole
 * Date: 2019/5/5 11:09
 * Description:
 */

package com.knights;/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
