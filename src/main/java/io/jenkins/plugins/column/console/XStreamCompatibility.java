/*
 * The MIT License
 *
 * Copyright (c) 2011, Jesse Farinacci
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.jenkins.plugins.column.console;

import hudson.init.InitMilestone;
import hudson.init.Initializer;
import hudson.model.Items;
import java.util.logging.Logger;

/**
 * @author <a href="mailto:jieryn@gmail.com">Jesse Farinacci</a>
 * @since 1.6
 */
public final class XStreamCompatibility {
    private static final Logger LOG = Logger.getLogger(XStreamCompatibility.class.getName());

    @Initializer(before = InitMilestone.PLUGINS_STARTED)
    public static void beforeInitMilestonePluginsStarted() {
        LOG.info("\n\n XSTREAM COMPATABILITY INIT \n\n");
        Items.XSTREAM2.addCompatibilityAlias("hudson.plugins.column.console.LastBuildColumn", LastBuildColumn.class);
        Items.XSTREAM2.addCompatibilityAlias(
                "hudson.plugins.column.console.LastFailedBuildColumn", LastFailedBuildColumn.class);
        Items.XSTREAM2.addCompatibilityAlias(
                "hudson.plugins.column.console.LastStableBuildColumn", LastStableBuildColumn.class);
        Items.XSTREAM2.addCompatibilityAlias(
                "hudson.plugins.column.console.LastSuccessfulBuildColumn", LastSuccessfulBuildColumn.class);
        Items.XSTREAM2.addCompatibilityAlias(
                "hudson.plugins.column.console.LastUnstableBuildColumn", LastUnstableBuildColumn.class);
        Items.XSTREAM2.addCompatibilityAlias(
                "hudson.plugins.column.console.LastUnsuccessfulBuildColumn", LastUnsuccessfulBuildColumn.class);
    }
}
