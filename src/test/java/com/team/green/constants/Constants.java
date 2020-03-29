package com.team.green.constants;

import org.openqa.selenium.By;

public class Constants {

    public static String WEBLINK = "https://www.gittigidiyor.com/";

    public static final By ACCOUNT_OVER = By.className("profile-container");
    public static final By LOGIN_BUTTON = By.className("sign-in-button");
    public static final By LOGIN_EMAIL = By.id("L-UserNameField");
    public static final By LOGIN_PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By INPUT = By.id("search_word");
    public static final By SEARCH = By.id("header-search-find-link");
    public static final By PRODUCT_PATH = By.xpath("//p[@class='image-container'][4]");
    public static final By ADDFAV = By.className("gg-icon.gg-icon-favorite-pdp");

    //LiveSupport Constans Baran Kısa

    public static final By BIZE_ULAS = By.linkText("Bize Ulaşın");
    public static final By lIVE_ARA = By.xpath("//*[@id=\"131:0-input\"]");
    public static final By LIVE_TIKLA = By.className("slds-button");
    public static final By CANLI_YARDIM = By.className("media-body");
    public static final By LIVE_ONCEKI = By.className("gg-chat-history-link");


}
