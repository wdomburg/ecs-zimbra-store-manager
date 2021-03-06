/*
 * Copyright (c) 2016 EMC Corporation. All Rights Reserved.
 *
 * Licensed under the EMC Software License Agreement for Free Software (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * https://github.com/EMCECS/ecs-zimbra-store-manager/blob/master/LICENSE.txt
 */
package com.emc.ecs.zimbra.integration;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Askhat_Shagirov on 28.01.2015.
 */
public class EcsLocatorUtilTest {

    @Test
    public void toStringLocator_ConvertsEcsLocatorCorrectly() {
        String bucketName = "zimbra.server1.1";
        String key = "fc159b81-4f34-4b51-adbd-967185389fef";
        EcsLocator locator = new EcsLocator(bucketName, key);

        assertEquals("zimbra.server1.1/fc159b81-4f34-4b51-adbd-967185389fef", EcsLocatorUtil.toStringLocator(locator));
    }

    @Test
    public void fromStringLocator_ParsesValidEcsLocator() {
        EcsLocator locator = EcsLocatorUtil.fromStringLocator("zimbra.server1.1/fc159b81-4f34-4b51-adbd-967185389fef");

        assertEquals("zimbra.server1.1", locator.getBucketName());
        assertEquals("fc159b81-4f34-4b51-adbd-967185389fef", locator.getKey());
    }
}
