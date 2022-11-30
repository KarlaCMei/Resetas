package com.example.recetas.data;


public class Platillos {
    private String name;
    private String ingredients;
    private String preparation;
    private String urlImg;


    public Platillos() {
    }

    public Platillos(String preparation, String nombre, String ingredients, String urlImg) {
        this.preparation = preparation;
        this.name = nombre;
        this.ingredients = ingredients;
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
