import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.IndexPage;
import pages.SigninPage;

public class Compra extends Hooks{

    @Test
    public void realizarCompraComSucesso(){

        IndexPage indexPage = new IndexPage();
        SigninPage signinPage = new SigninPage();

        Assertions.assertTrue(indexPage.estaPresente(),
                "Pagina Index não apresentada!");

        indexPage.selecionaProduto("Blouse");
        signinPage.estaPresente();
        signinPage.criaConta();


    }

}
