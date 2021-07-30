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

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link TruckOnlineBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Jakub Palac - Initial contribution
 */
@NonNullByDefault
public class TruckOnlineBindingConstants {

    private static final String BINDING_ID = "truckonline";

    // List of all Thing Type UIDs
    public static final ThingTypeUID TRUCKONLINE_DEVICE = new ThingTypeUID(BINDING_ID, "truckonlineDevice");

    // List of all Channel ids
    public static final String CHANNEL_1 = "channel1";
}
