package com.nepxion.discovery.plugin.configcenter.apollo.extension;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.ctrip.framework.foundation.Foundation;
import com.nepxion.discovery.plugin.framework.extension.ApplicationInfoProvider;

public class ApolloApplicationInfoProvider implements ApplicationInfoProvider {
    @Override
    public String getAppId() {
        return Foundation.app().getAppId();
    }
}