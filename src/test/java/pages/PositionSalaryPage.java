package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import static pageModels.Buttons.Close;
import static pageModels.Buttons.Save;

public class PositionSalaryPage extends ParentClass {
    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.PositionSalary);
    }

    public boolean add(String PositionSalariText){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInputInPosSal, PositionSalariText);
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

    public boolean update(String oldPositionSalariText, String newPositionSalariText){
        editTheTableData(oldPositionSalariText);
        if (newPositionSalariText.length()>0){
            clear(DialogFormNameInputInPosSal);
            sendKeysTo(DialogFormNameInputInPosSal, newPositionSalariText);
        }

        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String positionSalary){
        return deleteTheTableData(positionSalary);
    }


}
