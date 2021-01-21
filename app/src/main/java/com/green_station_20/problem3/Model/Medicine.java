package com.green_station_20.problem3.Model;

public class Medicine {

    private String id;
    private String drugs;
    private String indications;
    private String therapeutic_class;
    private String pharmacology;
    private String dosage;
    private String interaction;
    private String contraindications;
    private String side_effects;
    private String pregnancy;
    private String precautions;
    private String storage;

    public  Medicine(){

    }

    public Medicine(String id, String drugs, String indications, String therapeutic_class, String pharmacology, String dosage, String interaction, String contraindications, String side_effects, String pregnancy, String precautions, String storage) {
        this.id = id;
        this.drugs = drugs;
        this.indications = indications;
        this.therapeutic_class = therapeutic_class;
        this.pharmacology = pharmacology;
        this.dosage = dosage;
        this.interaction = interaction;
        this.contraindications = contraindications;
        this.side_effects = side_effects;
        this.pregnancy = pregnancy;
        this.precautions = precautions;
        this.storage = storage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getTherapeutic_class() {
        return therapeutic_class;
    }

    public void setTherapeutic_class(String therapeutic_class) {
        this.therapeutic_class = therapeutic_class;
    }

    public String getPharmacology() {
        return pharmacology;
    }

    public void setPharmacology(String pharmacology) {
        this.pharmacology = pharmacology;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}


