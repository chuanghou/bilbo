package com.stellariver.bilbo;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import org.jetbrains.annotations.NotNull;



public class BilboDebuggerRunner implements ProgramRunner<BilboRunnerSettings> {

    @Override
    public @NotNull String getRunnerId() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        return true;
    }

    @Override
    public void execute(@NotNull ExecutionEnvironment environment) {
        System.out.println("Hello World");
    }

}
