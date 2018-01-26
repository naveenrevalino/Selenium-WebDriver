package junit_test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BasicsJunit.class,JunitReport.class,JunitAssertion.class,JunitAssertionUpdated.class})

public class TestSuite {

}
