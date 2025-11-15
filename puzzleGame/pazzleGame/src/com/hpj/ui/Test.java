package com.hpj.ui;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //创建一个游戏界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);
        gameJframe.setVisible(true);

        //创建一个登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //创建一个注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);

    }
}
