 Feature: E-commerce Project Website Healthcheck


 Scenario: User is able to Open the browser, navigate to the URL and able to Search for Product
           Given User opened browser
           And entered the Url and navigated to the Homepage
           When User search for product "Laptop"
           Then list of laptops should get displayed with all the details