package io.jenkins.plugins.column.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import hudson.views.ListViewColumn;
import hudson.views.ListViewColumnDescriptor;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.kohsuke.stapler.StaplerRequest2;

abstract class AbstractBuildColumnTest {

    protected abstract ListViewColumn getInstance();

    protected abstract String getDisplayName();

    protected ListViewColumnDescriptor getDescriptor() {
        return (ListViewColumnDescriptor) getInstance().getDescriptor();
    }

    @Test
    void displayName() {
        assertEquals(getDisplayName(), getDescriptor().getDisplayName(), "Expected matching display name");
    }

    @Test
    void newInstance() throws Exception {
        assertNotNull(
                getDescriptor().newInstance((StaplerRequest2) null, JSONObject.fromObject(null)),
                "Expected new instance");
    }

    @Test
    void defaultVisibility() {
        assertFalse(getDescriptor().shownByDefault(), "Expected not to be shown by default");
    }
}
