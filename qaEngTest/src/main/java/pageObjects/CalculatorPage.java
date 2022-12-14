package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_0']")
    private MobileElement btn0;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_1']")
    private MobileElement btn1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_2']")
    private MobileElement btn2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_3']")
    private MobileElement btn3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_4']")
    private MobileElement btn4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_5']")
    private MobileElement btn5;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_6']")
    private MobileElement btn6;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_7']")
    private MobileElement btn7;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_8']")
    private MobileElement btn8;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_9']")
    private MobileElement btn9;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_AC']")
    private MobileElement btnAC;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_+']")
    private MobileElement btnSoma;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='View_container']/android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement campoResultado;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_=']")
    private MobileElement btnIgual;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_-']")
    private MobileElement btnSubtracao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_/']")
    private MobileElement btnDivisao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text_*']")
    private MobileElement btnMultiplicacao;

    public void btnDivisao() {
        btnDivisao.click();
    }

    public void btnAC(){
        btnAC.click();
    }

    public void btnMultiplicacao() {
        btnMultiplicacao.click();
    }

    public void btnSubtracao(){
        btnSubtracao.click();
    }

    public void btnIgual() {
        btnIgual.click();
    }

    public void validarQueEstouNoApp() {
        btnAC.click();
    }

    public void validarResultado() {
        campoResultado.getText();
    }

    public void btnSoma() {
        btnSoma.click();
    }

    public void clicarBtn0() {
        btn0.click();
    }

    public void clicarBtn1() {
        btn1.click();
    }

    public void clicarBtn2() {
        btn2.click();
    }

    public void clicarBtn3() {
        btn3.click();
    }

    public void clicarBtn4() {
        btn4.click();
    }

    public void clicarBtn5() {
        btn5.click();
    }

    public void clicarBtn6() {
        btn6.click();
    }

    public void clicarBtn7() {
        btn7.click();
    }

    public void clicarBtn8() {
        btn8.click();
    }

    public void clicarBtn9() {
        btn9.click();
    }

}