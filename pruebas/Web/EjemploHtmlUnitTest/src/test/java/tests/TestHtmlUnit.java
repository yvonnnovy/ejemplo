/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author jose maria
 */
public class TestHtmlUnit {

    public TestHtmlUnit() {
    }

    @Test
    public void paginaRaiz() throws Exception {        
        final WebClient webClient = new WebClient();
        final HtmlPage page = webClient.getPage("http://localhost:8084/EjemploHtmlUnit");

        final String pageAsXml = page.asXml();
        assertTrue(pageAsXml.contains("<body class=\"composite\">"));

        final String pageAsText = page.asText();
        assertTrue(pageAsText.contains("Probando con HtmlUnit + Maven!"));

        webClient.closeAllWindows();
    }

    @Test
    public void paginaRaizFirefox() throws Exception {
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_10);
        final HtmlPage page = webClient.getPage("http://localhost:8084/EjemploHtmlUnit");
        assertTrue(page.getTitleText().contains("HtmlUnit"));
        webClient.closeAllWindows();
    }

    @Test
    public void xpath() throws Exception {
        final WebClient webClient = new WebClient();
        final HtmlPage page = webClient.getPage("http://localhost:8084/EjemploHtmlUnit");
        final List<?> divs = page.getByXPath("//div");
        assertFalse(divs.isEmpty());
        List<?> lista = page.getByXPath("//div[@name='John']");
        assertTrue(lista.isEmpty());
        webClient.closeAllWindows();
    }

//    @Test
//    public void homePage_proxy() throws Exception {
//        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_10, "proxy.indra.es", 8080);
//
//        final DefaultCredentialsProvider credentialsProvider = (DefaultCredentialsProvider) webClient.getCredentialsProvider();
//        credentialsProvider.addCredentials("usuario", "clave");
//
//        final HtmlPage page = webClient.getPage("http://localhost:8084/EjemploHtmlUnit");
//        assertFalse("Fallará".equals(page.getTitleText()));
//        webClient.closeAllWindows();
//    }
}
