/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.truckonline.internal;

/**
 * The {@link TruckOnlineConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Jakub Palac - Initial contribution
 */
public class TruckOnlineConfiguration {

    /**
     * Sample configuration parameters. Replace with your own.
     */

    public @Nullable String company;
    public @Nullable String user;
    public @Nullable String password;
    public int refreshInterval;
}
