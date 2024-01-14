package com.stellariver.bilbo;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Objects;

public class BilboSettingsConfigurable implements Configurable {

    private BilboSettingComponent bilboSettingComponent;

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "Bilbo Settings";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return bilboSettingComponent.getPreferredFocusedComponent();
    }

    @Override
    public @Nullable JComponent createComponent() {
        bilboSettingComponent = new BilboSettingComponent();
        return bilboSettingComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        BilboSettingState bilboSettingState = ApplicationManager.getApplication().getService(BilboSettingState.class);
        if (bilboSettingState == null) {
            return false;
        }
        boolean equals0 = Objects.equals(bilboSettingState.ip, bilboSettingComponent.getIp());
        boolean equals1 = Objects.equals(bilboSettingState.port, bilboSettingComponent.getPort());
        return (!equals0) || (!equals1);
    }

    @Override
    public void apply() {
        BilboSettingState settings = BilboSettingState.getInstance();
        settings.ip = bilboSettingComponent.getIp();
        settings.port = bilboSettingComponent.getPort();
    }

    @Override
    public void reset() {
        BilboSettingState settings = BilboSettingState.getInstance();
        bilboSettingComponent.setIp(settings.ip);
        bilboSettingComponent.setPort(settings.port);
    }

    @Override
    public void disposeUIResources() {
        bilboSettingComponent = null;
    }
}
