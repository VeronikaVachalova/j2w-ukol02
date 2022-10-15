package cz.czechitas.java2webapps.ukol2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
public class MainController {
private final Random random = new Random();

@GetMapping("/")
public ModelAndView ukazObrazekACitat() {

List<String> seznamCitaci = List.of(
   "Be the change you want to see in the world. Mahatma Gandhi",
   "The purpose of our life is being happy. Dalajlama",
   "Life is what happens when you're busy making other plans. John Lennon",
   "In order to write about life first you must live it. Ernest Hemingway",
   "Life is like riding a bicycle. To keep your balance, you must keep moving. Albert Einstein");

List<String> seznamObrazku = List.of(
    "bj-un6ni8ys",
    "YXVW6v0Udi0",
    "T7akogA-uew",
    "jvhMDjoR4L0",
    "WSt5SfRMqZg",
    "7tM8y1SNg0E",
    "KyUtRKiiuvQ",
    "rADMQ-bT-d0",
    "6UlhJUUBNo8",
   "dDtOLVtlKLI");

    int vyberObrazek = random.nextInt(seznamObrazku.size());
    int vyberCitat = random.nextInt(seznamCitaci.size());
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("obrazek", seznamObrazku.get(vyberObrazek));
    modelAndView.addObject("citat", seznamCitaci.get(vyberCitat));
    return modelAndView;
}
}
