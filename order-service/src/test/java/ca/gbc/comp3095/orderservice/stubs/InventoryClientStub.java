package ca.gbc.comp3095.orderservice.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class InventoryClientStub {

    /**
     * This method sets up a stub for the GET request made to the inventory-service
     * I will respond with an HTTP 200-OK status code and return a body of "true"
     * meaning the inventory (sku_code) and quantity are saatisfied
     * @param skuCode - product skucode
     * @param quantity - quantity on hand
     */
    public static void stubInventoryCall(String skuCode, Integer quantity) {

        stubFor(get(urlEqualTo("/api/inventory?skuCode=" + skuCode + "&quantity=" + quantity))
                .willReturn(aResponse()
                        .withStatus(200) //The HTTP Status expected for GET communication success
                        .withHeader("Content-Type", "application/json") //JSON expectation
                        .withBody("true")));  //The mock response body indicating the item is in stock
        // If we want to check for something not in stock we still get 200 status code but we need to refactor body to "false"

    }

}
