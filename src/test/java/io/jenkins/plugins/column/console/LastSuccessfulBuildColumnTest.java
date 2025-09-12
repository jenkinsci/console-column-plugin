package io.jenkins.plugins.column.console;

import hudson.views.ListViewColumn;
import io.jenkins.plugins.column.Messages;

class LastSuccessfulBuildColumnTest extends AbstractBuildColumnTest {

    @Override
    protected ListViewColumn getInstance() {
        return new LastSuccessfulBuildColumn();
    }

    @Override
    protected String getDisplayName() {
        return Messages.ConsoleColumn_Last_Successful_DisplayName();
    }
}
