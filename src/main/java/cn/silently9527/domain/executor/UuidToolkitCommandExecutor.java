package cn.silently9527.domain.executor;

import cn.silently9527.domain.ToolkitCommand;
import com.intellij.openapi.actionSystem.DataContext;

public class UuidToolkitCommandExecutor implements ToolkitCommandExecutor {
    @Override
    public boolean support(ToolkitCommand command) {
        return false;
    }

    @Override
    public void execute(ToolkitCommand command, DataContext dataContext) {

    }
}