package lecture22.examples.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

    @Given("I have these fruits:")
    public void addFruits(DataTable dataTable) {
        List<String> fruits = dataTable.asList(String.class);

        for (String fruit : fruits) {
            // Logic to add each fruit to the basket
            System.out.println("I have a " + fruit);
        }
        Assert.assertTrue(false);
    }
    @Given("I have these items:")
    public void addItems(DataTable dataTable) {
        List<Map<String, String>> items = dataTable.asMaps(String.class, String.class);
        // map1: Item:Apples Quantity:5
        // map2: Item:Banana Quantity:3
        // map3: Item:Oranges Quantity:4
        for (Map<String, String> item : items) {
            String itemName = item.get("Item");
            String quantity = item.get("Quantity");
            System.out.println("I have " + quantity + " " + itemName);
        }
    }

    @Given("the following users exist:")
    public void theFollowingUsersExist(DataTable dataTable) {
        List<Map<String, String>> userMaps = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> userMap: userMaps) {
            String name = userMap.get("name");
            String email = userMap.get("email");
            String twitter = userMap.get("twitter");
            System.out.println("Username: " + name + "| Email: " + email + " |Twitter: " + twitter);
        }
    }
}
