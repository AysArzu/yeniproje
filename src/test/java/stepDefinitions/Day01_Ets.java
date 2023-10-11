package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.EtsTur;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.click;

public class Day01_Ets {
    EtsTur page = new EtsTur();
    String expectedUrl="";
    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etstur"));
        expectedUrl = Driver.getDriver().getCurrentUrl();

    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
        ReusableMethods.hover(page.login);
        ReusableMethods.wait(2);
    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {

        page.giris.click();
        ReusableMethods.wait(2);
    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.email.sendKeys("ayse@gmail.com");
        ReusableMethods.wait(2);
    }

    @And("password girilir")
    public void passwordGirilir() {
        page.password.sendKeys("5243589443");
        ReusableMethods.wait(2);
    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        page.girisYap.click();
        ReusableMethods.wait(2);
    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
        Driver.closeDriver();

    }

    @And("soyad girilir")
    public void soyadGirilir() {

        page.soyad.sendKeys("gsfdgdfg");
        ReusableMethods.wait(2);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        page.uyeOl.click();
        ReusableMethods.wait(2);
    }

    @And("ad girilir")
    public void adGirilir() {

        page.ad.sendKeys("gdfsdfg");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
        page.eposta.sendKeys("arzu@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.ceptel.sendKeys("5344536647");
        ReusableMethods.wait(2);
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        page.sifre1.sendKeys("4545677788");
    }

    @And("password yeniden girilir")
    public void passwordYenidenGirilir() {
        page.sifre2.sendKeys("4545677788");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        click(page.kullanim);
    }

    @And("kampanyalara checkbox secilir")
    public void kampanyalaraCheckboxSecilir() {
        page.firsat.click();
    }

    @When("uyelik sayfasinda uye ol butonuna basilir")
    public void uyelikSayfasindaUyeOlButonunaBasilir() {
        page.uyelikUyeOl.click();

    }
}

