package com.team.green.page;

import com.sun.prism.impl.paint.PaintUtil;
import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.team.green.constants.Constants.*;

public class LiveSupportPage extends BasePage {

    public LiveSupportPage(WebDriver driver) {
        super(driver);
    }

    public void bizUlsClick() {
        click(BIZE_ULAS);
    }

    public void liveAra(String text1) {
        sendKeys(lIVE_ARA, text1);

    }

    public void liveTikla() {
        click(LIVE_TIKLA);
    }

    public void cnlYrdmClick() {
        click(CANLI_YARDIM);
    }


    public void liveOnceki() {
        click(LIVE_ONCEKI);
    }

}



