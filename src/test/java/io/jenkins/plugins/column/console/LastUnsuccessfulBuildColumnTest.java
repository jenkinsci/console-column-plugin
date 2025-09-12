package io.jenkins.plugins.column.console;

import hudson.views.ListViewColumn;
import io.jenkins.plugins.column.Messages;

class LastUnsuccessfulBuildColumnTest extends AbstractBuildColumnTest {

    @Override
    protected ListViewColumn getInstance() {
        return new LastUnsuccessfulBuildColumn();
    }

    @Override
    protected String getDisplayName() {
        return Messages.ConsoleColumn_Last_Unsuccessful_DisplayName();
    }
}
