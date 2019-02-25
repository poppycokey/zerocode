package org.jsmart.zerocode.testhelp.tests.extendedtest;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class expression {

    @Test
    @JsonTestCase("expression/expressiontest.json")
    public void testexpression() throws Exception {
    }
}
