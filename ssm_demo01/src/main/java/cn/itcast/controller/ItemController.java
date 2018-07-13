package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService is;
	@RequestMapping("/find")
public String findItemById(int id,Model model) {
	Item item = is.findItemById(id);
	model.addAttribute("item", item);
	return "index";
}
}
