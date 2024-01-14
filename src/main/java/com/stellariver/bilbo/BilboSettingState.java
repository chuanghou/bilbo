package com.stellariver.bilbo;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = "com.stellariver.bilbo.BilboSettingState",
        storages = @Storage("BilboSettingState.xml")
)
public class BilboSettingState implements PersistentStateComponent<BilboSettingState> {

    public String ip;
    public Integer port = 24113;

    @Override
    public @Nullable BilboSettingState getState() {
        return this;
    }

    static public BilboSettingState getInstance() {
        return ApplicationManager.getApplication().getService(BilboSettingState.class);
    }

    @Override
    public void loadState(@NotNull BilboSettingState state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}
