import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * Date: 4/06/12
 * Time: 01:16 PM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com>jaehoo@gmail.com</a>
 */

@Stateless
public class TestClass implements TestDaoLocal {


    @Override
    public String getHello() {
        return "HELLO WORLD";
    }
}
