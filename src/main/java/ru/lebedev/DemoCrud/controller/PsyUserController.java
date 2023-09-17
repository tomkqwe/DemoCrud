package ru.lebedev.DemoCrud.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lebedev.DemoCrud.entity.PsyUserEntity;
import ru.lebedev.DemoCrud.repository.PsyUserEntityRepository;

@RestController
public class PsyUserController {
    @Autowired
    private PsyUserEntityRepository psyUserEntityRepository;

    @GetMapping("/signup")
    public String showSignUpForm(PsyUserEntity psyUserEntity) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid PsyUserEntity psyUserEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
    psyUserEntityRepository.save(psyUserEntity);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", psyUserEntityRepository.findAll());
        return "index";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        PsyUserEntity user = psyUserEntityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("user", user);
        return "update-user";
    }
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid PsyUserEntity user,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
//            user.setId(id);

            return "update-user";
        }

        psyUserEntityRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        PsyUserEntity user = psyUserEntityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        psyUserEntityRepository.delete(user);
        return "redirect:/index";
    }

}
