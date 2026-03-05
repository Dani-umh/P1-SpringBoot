package demoapp.controller;

import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import javax.validation.Valid;

@Controller
public class SaludoControllerForm {

    @Autowired
    private SaludoService service;

    @GetMapping("/saludoform")
    // Hay que declarar un parámetro con el tipo usado en el modelo del formulario (UserData)
    public String saludoForm(UserData userData) {
        return "formRegistro";
    }

    @PostMapping(value = "/saludoform", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String checkPersonInfo(@ModelAttribute @Valid UserData userData,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ERROR";
        }
        return "Hello " + userData.getNombre();
    }
}
