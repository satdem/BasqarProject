package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import static pageModels.Buttons.Close;
import static pageModels.Buttons.Save;

public class CountryPage extends ParentClass {

    public void getPage(){
        clickOnMenuTo1(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Countries);
    }


    public boolean add(String newCountryName){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newCountryName);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean add(String newCountryName, String newCountryCode){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newCountryName);
        sendKeysTo(DialogFormCodeInput, newCountryCode);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean update(String oldCountryName, String newCountryName, String newCountryCode){
        editTheTableData(oldCountryName);
        if (newCountryName.length()>0){
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, newCountryName);
        }
        if (newCountryCode.length()>0) {
            clear(DialogFormCodeInput);
            sendKeysTo(DialogFormCodeInput, newCountryCode);
        }
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }


    public boolean delete(String country){
        return deleteTheTableData(country);
    }

}
