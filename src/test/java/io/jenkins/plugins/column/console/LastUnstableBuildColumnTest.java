package io.jenkins.plugins.column.console;

import hudson.views.ListViewColumn;
import io.jenkins.plugins.column.Messages;

class LastUnstableBuildColumnTest extends AbstractBuildColumnTest {

    @Override
    protected ListViewColumn getInstance() {
        return new LastUnstableBuildColumn();
    }

    @Override
    protected String getDisplayName() {
        return Messages.ConsoleColumn_Last_Unstable_DisplayName();
    }
}
