package pages;
import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import static pageModels.Buttons.Close;
import static pageModels.Buttons.Save;

public class SubjectCategoriesPage extends ParentClass {
    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo1(NavBarObjects.SubjectCategories);
    }

    public boolean add(String SubjectCategoriesName,String code){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, SubjectCategoriesName);
        sendKeysTo(DialogFormCodeInput, code);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean update(String oldName, String newName){
        editTheTableData(oldName);
        if (newName.length()>0) {
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, newName);
        }
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String SubjectCategoriesName){
        return deleteTheTableData(SubjectCategoriesName);
    }

}
