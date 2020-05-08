import org.openqa.selenium.By;

public class Index extends BaseTest implements DefaultProperties {

    private By btnProduct;

    public void accessApplication () {
        getDriver().get(URL_BASE);
    }

    public void selectProduct (String productChoosed)
    {
        btnProduct = (By.cssSelector("ul[id='homefeatured'] a[class='product-name'][title='"
        + productChoosed + "']"));
        getDriver().findElement(btnProduct).click();
    }

}