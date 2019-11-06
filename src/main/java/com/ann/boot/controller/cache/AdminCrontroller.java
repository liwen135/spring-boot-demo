package com.ann.boot.controller.cache;

import com.ann.boot.entity.Menu;
import com.ann.boot.entity.MenuNode;
import com.ann.boot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AdminCrontroller {


    @Autowired
    MenuService menuService;

    @RequestMapping("/addmenu.json")
    public @ResponseBody
    String add() throws Exception {
        menuService.addMenu(null);
        //模拟改变缓存
        return "{\"success\":true}";
    }

    @RequestMapping("/getmenu.json")
    public @ResponseBody
    Menu getMenu(Long menuId) throws Exception {
        return menuService.getMenu(menuId);
    }

    @RequestMapping("/tree.json")
    public @ResponseBody
    MenuNode tree() throws Exception {
        return menuService.getMenuTree();
    }


}
