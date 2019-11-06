package com.ann.boot.service;


import com.ann.boot.entity.Menu;
import com.ann.boot.entity.MenuNode;

public interface MenuService {
    public void addMenu(Menu menu);

    public Menu getMenu(Long id);

    public MenuNode getMenuTree();
}
