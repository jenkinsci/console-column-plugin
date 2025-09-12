package io.jenkins.plugins.column.console;

import hudson.views.ListViewColumn;
import io.jenkins.plugins.column.Messages;

class LastFailedBuildColumnTest extends AbstractBuildColumnTest {

    @Override
    protected ListViewColumn getInstance() {
        return new LastFailedBuildColumn();
    }

    @Override
    protected String getDisplayName() {
        return Messages.ConsoleColumn_Last_Failed_DisplayName();
    }
}
