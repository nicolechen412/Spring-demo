package com.knights;

import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */
public class BraveKnightTest {

    @Test
    public void testEmbarkOnQuest() {
       Quest mockquest = mock(Quest.class);
       BraveKnight knight = new BraveKnight(mockquest);
       knight.embarkOnQuest();
       verify(mockquest, times(1)).embark();
    }
}