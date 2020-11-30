package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CostCentersPage;

import java.util.Map;

public class CostCentersSteps {
    CostCentersPage ccp=new CostCentersPage();
    @Given("^User navigate to cost centers page$")
    public void userNavigateToCostCentersPage() {
        ccp.getPage();
    }

    @When("^User create a cost center$")
    public void userCreateACostCenter(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        String name = map.get("name");
        String code = map.get("code");
        String type = map.get("type");
        int orderNo = Integer.parseInt(map.get("orderNo"));
        String key = map.get("key");
        String value = map.get("value");
        int expense = Integer.parseInt(map.get("expense"));

        String typeStr="";
        int typeInt=-1;
        try{
            typeInt = Integer.parseInt(type);
        }catch (Exception e){
            typeStr = type;
        }
        if (typeInt>-1)
            ccp.add(name, code, typeInt, orderNo, key, value, expense);
        else
            ccp.add(name, code, typeStr, orderNo, key, value, expense);

    }

    @When("^User update the cost center name as \"([^\"]*)\"$")
    public void userUpdateTheCostCenterNameAs(String oldName,DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        String name = map.get("name");
        String code = map.get("code");
        String type = map.get("type");
        int orderNo = Integer.parseInt(map.get("orderNo"));
        String key = map.get("key");
        String value = map.get("value");
        int expense = Integer.parseInt(map.get("expense"));

        String typeStr="";
        int typeInt=-1;
        try{
            typeInt = Integer.parseInt(type);
        }catch (Exception e){
            typeStr = type;
        }
        if (typeInt>-1)
            ccp.update(oldName, name, code, typeInt, orderNo, key, value, expense);
        else
            ccp.update(oldName, name, code, typeStr, orderNo, key, value, expense);


    }

    @When("^User delete the cost center name as \"([^\"]*)\"$")
    public void userDeleteTheCostCenterNameAs(String name)  {
        ccp.delete(name);

    }
}
