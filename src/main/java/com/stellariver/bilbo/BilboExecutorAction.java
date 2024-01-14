package com.stellariver.bilbo;

import com.intellij.execution.Executor;
import com.intellij.execution.dashboard.actions.ExecutorAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class BilboExecutorAction extends ExecutorAction {
    @Override
    protected Executor getExecutor() {
        return BilboRunExecutor.getBilboRunExecutorInstance();
    }

    @Override
    protected void update(@NotNull AnActionEvent e, boolean running) {

    }
}
