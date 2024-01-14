package com.stellariver.bilbo;

import com.intellij.execution.Executor;
import com.intellij.execution.ExecutorRegistry;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BilboRunExecutor extends DefaultRunExecutor {

    @NotNull
    @Override
    public String getToolWindowId() {
        return this.getClass().getSimpleName();
    }

    @NotNull
    @Override
    public Icon getToolWindowIcon() {
        return IconLoader.getIcon("icons/toolWindowGyroDebugger.svg", this.getClass());
    }

    @Override
    @NotNull
    public Icon getIcon() {
        return IconLoader.getIcon("icons/startGyroDebugger.svg", this.getClass());
    }

    @Override
    public Icon getDisabledIcon() {
        return IconLoader.getDisabledIcon(getIcon());
    }

    @Override
    @NotNull
    public String getActionName() {
        return "Bilbo Run";
    }

    @NotNull
    @Override
    public String getId() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getContextActionId() {
        return this.getClass().getSimpleName();
    }

    @Override
    @NotNull
    public String getStartActionText() {
        return "Gyro Debug";
    }

    @Override
    public String getDescription() {
        return "Bilbo run";
    }

    @Override
    public boolean isSupportedOnTarget() {
        return true;
    }

    public static Executor getBilboRunExecutorInstance() {
        return ExecutorRegistry.getInstance().getExecutorById(BilboRunExecutor.class.getSimpleName());
    }

}
