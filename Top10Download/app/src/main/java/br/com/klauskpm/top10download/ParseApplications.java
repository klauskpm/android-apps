package br.com.klauskpm.top10download;

import java.util.ArrayList;

/**
 * Created by klaus.machado on 17/06/2016.
 */
public class ParseApplications {
    private String xmlData;
    private ArrayList<Application> applications;

    public ParseApplications(String xmlData) {
        this.xmlData = xmlData;
        applications = new ArrayList<Application>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}
