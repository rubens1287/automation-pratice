package pages;

import core.DriverManager;
import interfaces.TestingType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IndexPage extends DriverManager implements TestingType {

    private By txtPesquisa = By.id("search_query_top");
    private By btnAddCarrinho = By.id("add_to_cart");
    private By btnProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");
    private By btnProceedToCheckout1 = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");


    public boolean estaPresente() {
        return getWait().until(ExpectedConditions.elementToBeClickable(txtPesquisa)).isEnabled();
    }

    public void selecionaProduto(String nome){

        WebElement produto = getDriver().findElement(
                By.xpath("//ul[@id='homefeatured']//a[@class='product-name' " +
                        "and @title='"+nome+"']"));
        produto.click();
        adicionaNoCarrinho();
    }
    /**
     *  Metodo resposavel por adicionar um produto no carrinho
     *
     * @since 24/11/2020
     */
    private void adicionaNoCarrinho(){
        getWait()
                .until(ExpectedConditions
                        .elementToBeClickable(btnAddCarrinho)).click();
        getWait()
                .until(ExpectedConditions
                        .elementToBeClickable(btnProceedToCheckout)).click();

        getWait()
                .until(ExpectedConditions
                        .elementToBeClickable(btnProceedToCheckout1)).click();

    }



}
