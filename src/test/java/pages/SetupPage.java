package pages;

import eggTimer.util.DriverUtil;
import eggTimer.util.PropertyReaderUtil;
import io.cucumber.java.After;

import java.time.Duration;

public class SetupPage {

    PropertyReaderUtil propertyReaderUtil;
    public SetupPage(){
        propertyReaderUtil  = new PropertyReaderUtil();
    }

    public void setBrowser(){
       // propertyReaderUtil.loadConfigProperties();
        String browserName = propertyReaderUtil.getProperties("browser");
        DriverUtil.getInstance().setBrowser(browserName);
        setBrowserProperties();
    }

    public void setBrowserProperties(){
        DriverUtil.getInstance().getDriver().manage().window().maximize();
        DriverUtil.getInstance().getDriver().manage().deleteAllCookies();
        DriverUtil.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //DriverUtil.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



}
