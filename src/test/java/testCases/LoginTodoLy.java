package testCases;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import singletonSession.Session;

public class LoginTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal = new LoginModal();

    // @BeforeEach junit5 -- junitjupiter
    @BeforeEach
    public void before(){
        Session.getSession().getDriver().get("http://todo.ly/");
    }
    // @AfterEach  junit5 -- junitjupiter
    @AfterEach
    public void after(){
        Session.getSession().closeSession();
    }

    @Test
    public void verifyTheLogin(){
        mainPage.loginButton.click();
        loginModal.emailTxt.fillText("jbowasp57@jbowasp57.com");
        loginModal.passwordTxt.fillText("12345");
        loginModal.loginButon.click();

        // verificacion
        // Assertion.assertFalse(loginModal.loginButon.isControlDisplayed(),"ERROR");
        Assertions.assertFalse(loginModal.loginButon.isControlDisplayed(),"ERROR");
        //Assert.assertFalse("ERROR no ingreso al sistema",loginModal.loginButon.isControlDisplayed());
    }
}

