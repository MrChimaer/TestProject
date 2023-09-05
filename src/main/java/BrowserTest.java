import static com.codeborne.selenide.Selenide.*;

public class BrowserTest {
    public static void main(String[] args) {
        open("https://www.google.com/");
        sleep(10000);
    }
}
