import org.junit.Test;

import static org.junit.Assert.*;

public class testController extends BaseTest{

    private Index index = new Index();

    private Product product = new Product();

    private Cartao cartao = new Cartao();

    private Login login = new Login();

    private Register register = new Register();

    private Address address = new Address();

    private Shipping shipping = new Shipping();

    private Payment payment = new Payment();

    private OrderSummary orderSummary = new OrderSummary();

    private OrderConfirmation orderConfirmation = new OrderConfirmation();

    @Test
    public void test() {
        index.accessApplication();

        index.selectProduct("Printed Dress");

        product.confirmProduct();

        assertTrue(cartao.validateProduct("Printed Dress"));

        cartao.confirmShoppingCart();

        login.createNewAccount("Rafa776@gft.com.br");

        register.fillPersonalInformation("Rafael", "Fernandes", "54321");

        register.fillAddress("Rua Otavio, 111","Test","Massachusetts","12345","United States","11864152665","Boston");

        register.confirmRegistration();

        assertTrue(address.validateAddress("Rua Otavio, 111"));

        address.confirmAddress();

        shipping.confirmShipping();

        assertTrue(payment.validateTotalPrice("$29.00"));

        payment.selectPaymentMethod();

        orderSummary.confirmOrder();

        assertTrue(orderConfirmation.validateOrder("Your order on My Store is complete."));
    }

}