package io.jenkins.plugins.column.console;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import hudson.model.Items;
import java.util.logging.Level;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.LogRecorder;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;

@WithJenkins
class XStreamCompatibilityTest {

    @SuppressWarnings("unused")
    private JenkinsRule j;

    private final LogRecorder logging =
            new LogRecorder().record(XStreamCompatibility.class, Level.INFO).capture(10);

    @BeforeEach
    void beforeEach(JenkinsRule rule) {
        j = rule;
    }

    @Test
    void compatibilityAlias() {
        assertThat(logging, LogRecorder.recorded(containsString("XSTREAM COMPATABILITY INIT")));

        assertEquals(
                LastBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastBuildColumn"));
        assertEquals(
                LastFailedBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastFailedBuildColumn"));
        assertEquals(
                LastStableBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastStableBuildColumn"));
        assertEquals(
                LastSuccessfulBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastSuccessfulBuildColumn"));
        assertEquals(
                LastUnstableBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastUnstableBuildColumn"));
        assertEquals(
                LastUnsuccessfulBuildColumn.class,
                Items.XSTREAM2.getMapper().realClass("hudson.plugins.column.console.LastUnsuccessfulBuildColumn"));
    }
}
