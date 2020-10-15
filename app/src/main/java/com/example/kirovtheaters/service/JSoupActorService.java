package com.example.kirovtheaters.service;

import com.example.kirovtheaters.model.Actor;
import com.example.kirovtheaters.model.Theatre;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class JSoupActorService extends JSoupService {

    private static JSoupActorService instance;
    private JSoupActorService(Theatre theatre) throws IOException {
        super(theatre);
    }

    public static JSoupActorService getInstance(Theatre theatre) throws IOException {
        return instance == null ? new JSoupActorService(theatre) : instance;
    }

    public ArrayList<Actor> getSpasskyTheatreActorsList() {
        ArrayList<Actor> actors = new ArrayList<>();
        Element actorsInfo = document.getElementsByClass("t_user").first();
        for (Element actorInfo : actorsInfo.getElementsByAttributeValueStarting("class", "td")){
            actors.add(new Actor(actorInfo.getElementsByTag("p").get(1)
                    .getElementsByTag("a")
                    .text(),
                    url + actorInfo.getElementsByTag("img").attr("src")));
        }
        return actors;
    }

    public ArrayList<Actor> getDramaTheatreActorsList() {
        ArrayList<Actor> actors = new ArrayList<>();
        Element actorsInfo = document.getElementsByClass("t_person_list").first();
        for (Element actorInfo : actorsInfo.getElementsByAttributeValueStarting("href", "/person/")){
            Element info = actorInfo.getElementsByTag("img").first();
            if (info != null) actors.add(new Actor(info.attr("alt"),
                    url + info.attr("src")));
        }
        return actors;
    }

    public ArrayList<Actor> getDollTheatreActorsList() {
        return null;
    }
}
