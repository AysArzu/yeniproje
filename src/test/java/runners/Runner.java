package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
        },
        monochrome = true,//raporlarin console'da okunakli sekilde cikmasi icin
        features = "src/test/resources/features",//features folder path
        glue = {"stepDefinitions", "hooks"},   //stepdefinitions path
        tags = "@ets",
        dryRun = false
)
public class Runner {
}

//Bu sinif Test Caseleri run etmek icin kullanilir

//Runners class, feature file lar ile step definition'i birbirine baglar