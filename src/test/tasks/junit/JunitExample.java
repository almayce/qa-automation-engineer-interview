package junit;

import org.junit.*;

public class JunitExample {

    /**
     * Расскажите про каждую аннотацию, в чем их смысл.
     */

    @Rule
    RuleExample rule = new RuleExample();

    @Test
    public void test() {}

    @Before
    public void before() {}

    @After
    public void after() {}

    @BeforeClass
    public void beforeClass() {}

    @AfterClass
    public void afterClass() {}
}
