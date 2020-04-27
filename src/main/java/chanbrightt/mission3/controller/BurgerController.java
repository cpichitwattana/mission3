package chanbrightt.mission3.controller;

import chanbrightt.mission3.model.BurgerMenu;
import chanbrightt.mission3.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class BurgerController {

    @Autowired
    BurgerRepository burgerRepository;


    @GetMapping("/allMenus")
    public List<BurgerMenu> getAllBurgers(){
        return burgerRepository.findAll();
    }

    @GetMapping("/{menuId}")
    public BurgerMenu getMenuById(@PathVariable(name="menuId") Integer menuId){
        return burgerRepository.getOne(menuId);
    }

    @PostMapping("/save")
    public List<BurgerMenu> addMenu(@RequestBody BurgerMenu burgerMenu){
        burgerRepository.save(burgerMenu);
        return burgerRepository.findAll();
    }

    @DeleteMapping("/delete/{menuId}")
    public List<BurgerMenu> deleteById(@PathVariable(name="menuId") Integer menuId){
        burgerRepository.deleteById(menuId);
        return burgerRepository.findAll();
    }

    @PutMapping("/update")
    public BurgerMenu updateMenu(@RequestBody BurgerMenu burgerMenu){
        return burgerRepository.save(burgerMenu);
    }
}
