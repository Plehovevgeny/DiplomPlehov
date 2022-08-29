import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class test {

    @Test
    public void auth() {
        open("http://localhost:8080/");
        System.out.println();
    }
}
