import javax.ejb.Local;

/**
 * Created with IntelliJ IDEA.
 * User: jaehoo
 * Date: 4/24/14
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Local
public interface TestDaoLocal extends TestDaoRemote {

    public String getHello();
}
