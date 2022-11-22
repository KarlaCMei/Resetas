package com.example.recetas.data;


public class PlatosFuertesList {
    private String name;
    private String ingredients;
    private String preparation;
    private String urlImg;


    public PlatosFuertesList() {
    }

    public PlatosFuertesList(String calificacion, String nombre, String descripcion, String urlImg) {
        this.preparation = calificacion;
        this.name = nombre;
        this.ingredients = descripcion;
        this.urlImg = urlImg;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }





    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
