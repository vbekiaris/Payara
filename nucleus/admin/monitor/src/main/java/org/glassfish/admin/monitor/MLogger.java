/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2008-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.glassfish.admin.monitor;

import java.util.logging.*;
import org.glassfish.logging.annotation.LogMessageInfo;
import org.glassfish.logging.annotation.LoggerInfo;
import org.glassfish.logging.annotation.LogMessagesResourceBundle;

/**
 * A POL (plain old logger).
 *
 * @author bnevins
 */
public class MLogger {

    public static Logger getLogger() {
        return logger;
    }

    private MLogger() {
    }
    @LogMessagesResourceBundle
    public static final String SHARED_LOGMESSAGE_RESOURCE = "com.sun.enterprise.admin.monitor.LogMessages";
    @LoggerInfo(subsystem = "Monitoring", description = "Monitoring Logger", publish = true)
    public static final String LOGGER_NAME = "javax.enterprise.monitoring";
    private final static Logger logger = Logger.getLogger(LOGGER_NAME, SHARED_LOGMESSAGE_RESOURCE);
    // these messages are historical.  We've transitioned to this latest Logging API
    // TODO figure out cause/action etc.  This is too expensive to do right now...
    @LogMessageInfo(message =
    "Caught an Exception: {0}",
    comment = "Unhandled Exception",
    cause = "see Exception message",
    action = "see Exception message",
    level = "WARNING")
    public static final String UNHANDLED_EXCEPTION = "MNTG0000";
    @LogMessageInfo(message =
    "Caught an Exception: {0}",
    comment = "Unhandled Exception - Not an error.",
    cause = "see Exception message",
    action = "see Exception message",
    level = "INFO")
    public static final String UNHANDLED_EXCEPTION_INFO = "MNTG0001";
    @LogMessageInfo(
            message = "Flashlight listener registration failed for listener class: {0} , will retry later",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "WARNING")
    public static final String ListenerRegistrationFailed = "MNTG0201";
    @LogMessageInfo(
            message = "Unable to create container-monitoring for {0}.",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String cannotCreateConfigElement = "MNTG0210";
    @LogMessageInfo(
            message = "Invalid statsProvider (very likely a duplicate request), cannot unregister: {0}",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String invalidStatsProvider = "MNTG0202";
    @LogMessageInfo(
            message = "Error unregistering the stats provider  {0}",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String errorUnregisteringStatsProvider = "MNTG0208";
    @LogMessageInfo(
            message = "Cannot find node {0} for statsProvider {1}",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "WARNING")
    public static final String nodeNotFound = "MNTG0203";
    @LogMessageInfo(
     message = "Error resetting the stats provider: {0}",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String errorResettingStatsProvider = "MNTG0209";
    @LogMessageInfo(
     message = "{0} is not a ManagedObject and will not be registered with Gmbal to create an MBean",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String notaManagedObject = "MNTG0204";
    @LogMessageInfo(
     message = "Gmbal registration failed",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String gmbalRegistrationFailed = "MNTG0205";
    @LogMessageInfo(
     message = "Gmbal unregistration failed",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String gmbalUnRegistrationFailed = "MNTG0206";
    @LogMessageInfo(
     message = "module-monitoring-level or container-monitoring config element for {0} does not exist",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "WARNING")
    public static final String monitorElementDoesnotExist = "MNTG0207";
    @LogMessageInfo(
     message = "Unable to load the ProbeProvider",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String unableToLoadProbeProvider = "MNTG0104";
    @LogMessageInfo(
     message = "Unable to load the ProbeProvider",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String unableToProcessXMLProbeProvider = "MNTG0105";
    @LogMessageInfo(
     message = "Missing Module ({0})  From Xml Probe Providers",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "SEVERE")
    public static final String monitoringMissingModuleFromXmlProbeProviders = "MNTG0005";
    @LogMessageInfo(
     message = "mbean-enabled flag is turned on. Enabling all the MBeans",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String mbeanEnabled = "MNTG0109";
    @LogMessageInfo(
     message = "mbean-enabled flag is turned off. Disabling all the MBeans",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String mbeanDisabled = "MNTG0110";
    @LogMessageInfo(
     message = "dtrace-enabled flag is turned on/off. Enabling/Disabling DTrace",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String dtraceEnabled = "MNTG0111";
    @LogMessageInfo(
     message = "monitoring-enabled flag is turned on. Enabling all the Probes and Stats",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String monitoringEnabledLogMsg = "MNTG0112";
    @LogMessageInfo(
     message = "monitoring-enabled flag is turned off. Disabling all the Stats",
    comment = "see message",
    cause = "see message",
    action = "see message",
    level = "INFO")
    public static final String monitoringDisabledLogMsg = "MNTG0113";
}
