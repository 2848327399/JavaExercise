package com.hpj.ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        initJMenuBar();

        this.setVisible(true);
    }

    private void initJMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu functionMenu = new JMenu("功能");

        JMenu aboutMenu = new JMenu("关于");

        JMenuItem replayItem = new JMenuItem("重新开始");

        JMenuItem reLoginItem = new JMenuItem("重新登录");

        JMenuItem exitItem = new JMenuItem("退出");

        JMenuItem authorItem = new JMenuItem("作者");

        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(exitItem);

        aboutMenu.add(authorItem);

        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        this.setJMenuBar(menuBar);
    }

    private void initJFrame() {
        this.setSize(488, 500);

        this.setTitle("拼图单机版");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(3);
    }
}
