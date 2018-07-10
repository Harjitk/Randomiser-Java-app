package models;

import spark.ModelAndView;
import models.Name;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Controller {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        get("/one", (req, res) -> {
            Name name = new Name();
            String result = name.oneRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/two", (req, res) -> {
            Name name = new Name();
            ArrayList<String> results = name.pairOfRandomNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("pair", results);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }
}


//    It should have the following routes: /one - this should get a single random name from the list
//    and display that name in the browser
//    /two - this should get a random pair of names from the list and display that pair in the browser.

