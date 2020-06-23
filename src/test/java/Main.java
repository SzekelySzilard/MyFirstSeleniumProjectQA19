public class Main {


    public static void main(String[] args) {

//        Decomentati pentru windows cu Chrome V 83
      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

//        Decomentati pentru macOS cu Chrome V 83
      //  System.setProperty("webdriver.chrome.driver","resources/chromedriver");

        LoginTest login = new LoginTest();
        //login.login();
        RegisterTest account= new RegisterTest();
        //account.Account();
        AddToCartTest AddTo= new AddToCartTest();
      // AddTo.AddToCart();
       // AddTo.AddFromHomepage();
        CheckOutTest checkout= new CheckOutTest();
        //checkout.Checkout();
        SearchTest search= new SearchTest();
       // search.Search();
        WishListTest wish= new WishListTest();
        //wish.WishlistSale();
       LanguageTest Lang= new LanguageTest();
       //Lang.Language();




    }


}
