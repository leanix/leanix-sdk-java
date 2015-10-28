package net.leanix.api.test;

import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
// no classes to run, use as base class for a suite
@Suite.SuiteClasses({})
@Ignore
public class SuiteBase {
    @ClassRule
    public static final WorkspaceSetupRule setupRule = new WorkspaceSetupRule();
}
