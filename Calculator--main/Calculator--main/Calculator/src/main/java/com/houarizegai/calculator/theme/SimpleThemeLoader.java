package com.houarizegai.calculator.theme;

import com.houarizegai.calculator.theme.properties.Theme;
import java.util.HashMap;
import java.util.Map;

public class SimpleThemeLoader {
    
    public static Map<String, Theme> loadThemes() {
        Map<String, Theme> themes = new HashMap<>();
        
        // Light theme
        Theme lightTheme = new Theme();
        lightTheme.setApplicationBackground("FFFFFF");
        lightTheme.setTextColor("000000");
        lightTheme.setNumbersBackground("F0F0F0");
        lightTheme.setOperatorBackground("E0E0E0");
        lightTheme.setBtnEqualBackground("4CAF50");
        lightTheme.setBtnEqualTextColor("FFFFFF");
        themes.put("Light", lightTheme);
        
        // Dark theme
        Theme darkTheme = new Theme();
        darkTheme.setApplicationBackground("2E2E2E");
        darkTheme.setTextColor("FFFFFF");
        darkTheme.setNumbersBackground("404040");
        darkTheme.setOperatorBackground("505050");
        darkTheme.setBtnEqualBackground("FF6B35");
        darkTheme.setBtnEqualTextColor("FFFFFF");
        themes.put("Dark", darkTheme);
        
        return themes;
    }
}