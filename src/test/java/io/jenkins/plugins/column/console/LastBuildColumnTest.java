package io.jenkins.plugins.column.console;

import hudson.views.ListViewColumn;
import io.jenkins.plugins.column.Messages;

class LastBuildColumnTest extends AbstractBuildColumnTest {

    @Override
    protected ListViewColumn getInstance() {
        return new LastBuildColumn();
    }

    @Override
    protected String getDisplayName() {
        return Messages.ConsoleColumn_Last_DisplayName();
    }
}
