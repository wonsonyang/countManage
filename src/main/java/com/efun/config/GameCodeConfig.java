package com.efun.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class GameCodeConfig {

   // private static final String USE_OLDGETRATE_GAMECODE = PropertiesCacheUtil.getValue("USE_OLDGETRATE_GAMECODE", "common.properties")
    private static final String USE_OLDGETRATE_GAMECODE = "";

    public static boolean isUserOldGetRate(String gameCode){

        if (StringUtils.isNotEmpty(gameCode)){
            if (USE_OLDGETRATE_GAMECODE.contains("-"+gameCode.toUpperCase()+"-")){
                return true;
            }
        }
        return false;
    }
}
