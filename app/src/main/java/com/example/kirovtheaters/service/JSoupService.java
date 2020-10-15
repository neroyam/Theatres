package com.example.kirovtheaters.service;

import com.example.kirovtheaters.model.Theatre;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

abstract class JSoupService {

    protected Document document;
    protected String url;

    protected JSoupService(Theatre theatre) throws IOException {
        document = Jsoup.connect(theatre.getTroupe()).get();
        url = theatre.getSite();
    }
}
