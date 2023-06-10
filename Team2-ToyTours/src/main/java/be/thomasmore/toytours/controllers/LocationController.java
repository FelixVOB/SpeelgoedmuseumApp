package be.thomasmore.toytours.controllers;

import be.thomasmore.toytours.models.Locatie;
import be.thomasmore.toytours.repositories.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocatieRepository locatieRepository;

    @GetMapping("/location/{id}")
    public String addPlant(Model model, @PathVariable(required = false) int id) {
        if (id == 0) {
            return "location";
        }
        Optional<Locatie> locatieFromDb = locatieRepository.findById(id);
        if (locatieFromDb.isPresent()) {
            model.addAttribute("locatie", locatieFromDb.get());
        }
        return "Location";
    }
}
