package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.LiveSupportPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class LiveSupportPageTest extends BaseTest {
    LiveSupportPage liveSupport;

    @BeforeStep()
    public void before() {
        liveSupport = new LiveSupportPage(getWebDriver());
    }

    @Step("bize ulaşın sekmesine tıklanır")
    public void bizUlsClick() {
        liveSupport.bizUlsClick();
    }

    @Step("arama alanına <text> yazılır")

    public void liveAra(String text1) {
        liveSupport.liveAra(text1);
    }

    @Step("arama işlemi yapılır")
    public void liveTikla() {
        liveSupport.liveTikla();
    }

    @Step("bize yazın sekmesine tıklanır")
    public void cnlYrdmClick() {
        liveSupport.cnlYrdmClick();
    }


    @Step("önceki yazılar tıklanır")
    public void liveOnceki() {
        liveSupport.liveOnceki();
    }

}


