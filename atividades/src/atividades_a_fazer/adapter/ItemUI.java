package atividades_a_fazer.adapter;

import atividades_resolvidas.adapter.Item;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ItemUI {
    public static void exibir(List<Item> items) {
        JFrame frame = new JFrame("Items da interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Item item : items) {
            model.addElement(item.getNome());
        }

        JList<String> itemList = new JList<>(model);
        frame.add(new JScrollPane(itemList), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}