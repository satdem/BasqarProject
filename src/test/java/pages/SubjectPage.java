package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import static pageModels.Buttons.Close;
import static pageModels.Buttons.Save;

public class SubjectPage extends ParentClass {
    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Subjects);
    }

    public boolean add(String subjectName,String code,int subjectCatagory,int style){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, subjectName);
        sendKeysTo(DialogFormCodeInput, code);
        selectOption(DialogFormSubjectCategorySelect,subjectCatagory);
        selectOption(DialogFormStyleSelect,style);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }
    public boolean add(String subjectName,String code,String subjectCatagory,int style){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, subjectName);
        sendKeysTo(DialogFormCodeInput, code);
        selectOption(DialogFormSubjectCategorySelect,subjectCatagory);
        selectOption(DialogFormStyleSelect,style);
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

    public boolean delete(String subjectName){
        return deleteTheTableData(subjectName);
    }

}
