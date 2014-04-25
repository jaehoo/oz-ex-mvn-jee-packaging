import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created with IntelliJ IDEA.
 * User: jaehoo
 * Date: 4/25/14
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestService {

    public TestDaoLocal testDaoLocal;

    public TestService() {
        this.testDaoLocal = testDaoLocal;

        try {

            Context ctx = new InitialContext();
            this.testDaoLocal = ((TestDaoLocal)ctx.lookup("my-ear/TestClass/local"));

        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    public TestDaoLocal getTestDaoLocal() {
        return testDaoLocal;
    }

    public void setTestDaoLocal(TestDaoLocal testDaoLocal) {
        this.testDaoLocal = testDaoLocal;
    }

   public void getMessage(){

       System.out.printf("Message: %s", testDaoLocal.getHello());

   }


}
