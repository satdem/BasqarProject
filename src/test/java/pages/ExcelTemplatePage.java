package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import java.util.List;

import static pageModels.Buttons.Close;
import static pageModels.Buttons.Save;

public class ExcelTemplatePage extends ParentClass {

    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.ExcelTemplate);
    }
    public boolean add(String name, int periodCount){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, name);
        sendKeysTo(DialogFormPeriodCountInput, periodCount+"");
        clickToDialogButton(Save);
        clickToDialogButton(Close);
        return notificationResult(NotificationResults.Created);
    }
    public boolean add(String name, int periodCount, List<List<String>> listOfLists){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, name);
        sendKeysTo(DialogFormPeriodCountInput, periodCount+"");
        clickToDialogButton(Save);
        clickTo(TabPageVersions);
        for (List<String> list : listOfLists) {
            sendKeysTo(DialogFormRowSizeCountInput, list.get(0)+"");
            sendKeysTo(DialogFormColumnSizeCountInput, list.get(1)+"");
            clickTo(DialogButtonAddVersion);
        }
        clickToDialogButton(Save);
        clickToDialogButton(Close);
        return notificationResult(NotificationResults.Created);
    }
    public boolean update(String oldName, String name, int periodCount){
        editTheTableData(oldName);
        if (name.length() > 0){
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, name);
        }
        if (periodCount > 0) {
            clear(DialogFormPeriodCountInput);
            sendKeysTo(DialogFormPeriodCountInput, periodCount+"");
        }
        clickToDialogButton(Save);
        clickTo(TabPageVersions);
        clickToDialogButton(Close);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String excelTemplate){
        return deleteTheTableData(excelTemplate);
    }

}
