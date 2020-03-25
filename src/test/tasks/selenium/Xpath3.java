package selenium;

public class Xpath3 {

    /** Какой из четырех икспасов составлен верно и указывает на элемент? <a>
     * один верный ответ
     */

    /**
     * <body>
     * <div>
     * <a class="mw-wiki-logo" href="/wiki/Main_Page" title="Visit the main page"></a>
     * </div>
     * </body>
     */

    String xPath1 = "//div[@id='p-logo']/a[@title='Visit']";
    String xPath2 = "/a[@title='Visit the main page']";
    String xPath3 = "//*[contains(@class, 'logo')]";
    String xPath4 = "//span[@id='p-logo']";
}
