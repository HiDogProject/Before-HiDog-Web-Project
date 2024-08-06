package org.hidog.map.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
@RequiredArgsConstructor
public class MapController {

    @GetMapping("/main")
    public String join() {

        return "front/map/tMap";
    }
}
