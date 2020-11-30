package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import static pageModels.Buttons.Save;

public class CostCentersPage extends ParentClass {

    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.CostCenters);
    }

    public boolean add(String name, String code, String type,
                       int orderNo, String key, String value, int...expence){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, name);
        sendKeysTo(DialogFormCodeInput, code);
        selectOption(DialogFormTypeSelect, type);
        sendKeysTo(DialogFormOrderInput, orderNo+"");
        selectOptionMulti(DialogFormExpenseAccoutMultiSelect, expence );
        clickTo(TabPageConstants);
        sendKeysTo(DialogFormKeyInput, key);
        sendKeysTo(DialogFormValueTextInput, value);
        clickTo(DialogButtonAddWithText);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean add(String name, String code, int type,
                       int orderNo, String key, String value, int...expence){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, name);
        sendKeysTo(DialogFormCodeInput, code);
        selectOption(DialogFormTypeSelect, type);
        sendKeysTo(DialogFormOrderInput, orderNo+"");
        selectOptionMulti(DialogFormExpenseAccoutMultiSelect, expence );
        clickTo(TabPageConstants);
        sendKeysTo(DialogFormKeyInput, key);
        sendKeysTo(DialogFormValueTextInput, value);
        clickTo(DialogButtonAddWithText);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean update(String oldName, String name, String code, String type,
                          int orderNo, String key, String value, int...expence){
        editTheTableData(oldName);
        if (name.length() > 0){
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, name);
        }
        if (code.length() > 0) {
            clear(DialogFormCodeInput);
            sendKeysTo(DialogFormCodeInput, code);
        }
        if (type.length() > 0) {
            selectOption(DialogFormTypeSelect, type);
        }
        if (orderNo > 0) {
            clear(DialogFormOrderInput);
            sendKeysTo(DialogFormOrderInput, orderNo+"");
        }

        if (expence.length>0) {
            deleteMultiSelectOptions(MultiSelectOptionDelete);
            selectOptionMulti(DialogFormExpenseAccoutMultiSelect, expence);
        }
        clickTo(TabPageConstants);
        if (key.length() > 0) sendKeysTo(DialogFormKeyInput, key);
        if (value.length() > 0) sendKeysTo(DialogFormValueTextInput, value);

        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean update(String oldName, String name, String code, int type,
                          int orderNo, String key, String value, int...expence){
        editTheTableData(oldName);
        if (name.length() > 0){
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, name);
        }
        if (code.length() > 0) {
            clear(DialogFormCodeInput);
            sendKeysTo(DialogFormCodeInput, code);
        }
        if (type >= 0) {
            selectOption(DialogFormTypeSelect, type);
        }
        if (orderNo > 0) {
            clear(DialogFormOrderInput);
            sendKeysTo(DialogFormOrderInput, orderNo+"");
        }

        if (expence.length>0) {
            deleteMultiSelectOptions(MultiSelectOptionDelete);
            selectOptionMulti(DialogFormExpenseAccoutMultiSelect, expence);
        }
        clickTo(TabPageConstants);
        if (key.length() > 0) sendKeysTo(DialogFormKeyInput, key);
        if (value.length() > 0) sendKeysTo(DialogFormValueTextInput, value);

        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }
    public boolean delete(String name){
        return deleteTheTableData(name);
    }

}