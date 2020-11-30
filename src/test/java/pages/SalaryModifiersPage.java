package pages;

import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import utilities.ParentClass;

import java.util.Map;

import static pageModels.Buttons.Save;

public class SalaryModifiersPage extends ParentClass {

    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.SalaryModifiers);
    }

    public boolean add(Map<String, String> map){
        String description = map.get("description");
        String variable = map.get("variable");
        String modifierType = map.get("modifierType");
        String integrationCode = map.get("integrationCode");
        String valueType = map.get("valueType");
        String priority = map.get("priority");
        String amount = map.get("amount");
        String formula = map.get("formula");
        String name = map.get("name");
        String formulaVariable = map.get("formulaVariable");
        String modifierVariableType = map.get("modifierVariableType");

        clickTo(PageButtonAdd);
        sendKeysTo(PageFormDescriptionInput, description);
        sendKeysTo(PageFormVariableInput, variable);
        selectOption(PageFormModifierTypeSelect, Integer.parseInt(modifierType));
        sendKeysTo(PageFormIntegrationCodeInput, integrationCode);
        selectOption(PageFormValueTypeSelect, Integer.parseInt(valueType));
        sendKeysTo(PageFormPriorityIntInput, priority+"");
        if (driver.findElement(PageFormValueTypeSelect).getText().equalsIgnoreCase("formula")){
            sendKeysTo(PageFormFormulaInput, formula);
        }else {
            sendKeysTo(PageFormAmountIntInput, amount);
        }
        clickTo(PageButtonAdd);

        sendKeysTo(DialogFormName2Input, name);
        sendKeysTo(DialogFormFormulaVariableInput, formulaVariable);
        selectOption(DialogFormModifierVariableTypeSelect, Integer.parseInt(modifierVariableType));
        clickTo(DialogButtonApplyWithText);

        clickTo(PageButtonSaveWithText);
        getPage();
        return notificationResult(NotificationResults.Created);
    }


    public boolean update(String oldName, Map<String, String> map){
        String description = map.get("description");
        String variable = map.get("variable");
        String modifierType = map.get("modifierType");
        String integrationCode = map.get("integrationCode");
        String valueType = map.get("valueType");
        String priority = map.get("priority");
        String amount = map.get("amount");
        String formula = map.get("formula");
        String name = map.get("name");
        String formulaVariable = map.get("formulaVariable");
        String modifierVariableType = map.get("modifierVariableType");

        editTheTableData(oldName);
        sendKeysTo(PageFormDescriptionInput, description);
        sendKeysTo(PageFormVariableInput, variable);
        selectOption(PageFormModifierTypeSelect, Integer.parseInt(modifierType));
        sendKeysTo(PageFormIntegrationCodeInput, integrationCode);
        selectOption(PageFormValueTypeSelect, Integer.parseInt(valueType));
        sendKeysTo(PageFormPriorityIntInput, priority+"");
        if (driver.findElement(PageFormValueTypeSelect).getText().equalsIgnoreCase("formula")){
            sendKeysTo(PageFormFormulaInput, formula);
        }else {
            sendKeysTo(PageFormAmountIntInput, amount);
        }
        clickTo(PageButtonAdd);

        sendKeysTo(DialogFormName2Input, name);
        sendKeysTo(DialogFormFormulaVariableInput, formulaVariable);
        selectOption(DialogFormModifierVariableTypeSelect, Integer.parseInt(modifierVariableType));
        clickTo(DialogButtonApplyWithText);

        clickTo(PageButtonSaveWithText);

        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String salaryModifier){
        return deleteTheTableData(salaryModifier);
    }

}
