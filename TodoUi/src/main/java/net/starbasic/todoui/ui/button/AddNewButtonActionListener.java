package net.starbasic.todoui.ui.button;

import java.awt.event.ActionEvent;


public class AddNewButtonActionListener extends 
  ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        list.add("Запиши тут...");
        table.revalidate();
    }
}