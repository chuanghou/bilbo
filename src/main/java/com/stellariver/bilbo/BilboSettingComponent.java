package com.stellariver.bilbo;

import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;

import javax.swing.*;
import java.util.Objects;
import java.util.Optional;

public class BilboSettingComponent {

    private final JPanel jPanel;
    private final JBTextField ip = new JBTextField();
    private final JBTextField port = new JBTextField();

    public BilboSettingComponent() {
        jPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("IP:"), ip, 1, false)
                .addLabeledComponent(new JBLabel("PORT:"), port, 1, false)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return jPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return ip;
    }

    public String getIp() {
        return ip.getText();
    }

    public Integer getPort() {
        try {
            return Integer.parseInt(port.getText());
        } catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public void setIp(String ip) {
        this.ip.setText(ip);
    }

    public void setPort(Integer port) {
        this.port.setText(Optional.ofNullable(port).map(Objects::toString).orElse(null));
    }
}
