package Test_Library;

import Generic_Library.Launch;
import Pom_Library.LINE_HAUL.Terminals_Spots_POM;

import org.testng.annotations.Test;

public class Testcase01 extends Launch {
//    For forget password
//    @Test (priority = 0)
//    void tc01() {
//        SigninPom s=new SigninPom(driver);
//       s.clickForgotPswd();
//       s.setFp_email("");
//       s.clickProceedBtn();
//    }

    @Test (priority = 1)
    void tc02() throws Exception {
 Terminals_Spots_POM p = new Terminals_Spots_POM(driver);
        p.clickLinehaulBtn();
        p.clickTerminalsSpotsBtn();
        p.clickAddNewTerminalBtn();
        p.setTerminalNumber("8989");
        p.setTerminalName("Automation");
        p.setTerminalAbbreviation("123");
        p.setEmail_txt("test@test.com");
        p.setPhone_txt("4567894561");
        p.setAddress_txt("adventz infinity");
        p.clickAddTerminal_btn();
    }
}