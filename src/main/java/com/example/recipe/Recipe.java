package com.example.recipe;
public class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients=new ArrayList<String>();

    public Recipe(int recipeId,String recipeName,String recipeType,List<String> ingredients){
        this.recipeId=recipeId;
        this.recipeName=recipeName;
        this.recipeType=recipeType;
        this.ingredients=ingredients;
    }

    public int getRecipeId(){
        return recipeId;
    }
    public void setRecipeId(int recipeId){
        this.recipeId=recipeId;
    }
    public String getRecipeName(){
        return recipeName;
    }
    public void setRecipeName(String recipeName){
        this.recipeName=recipeName;
    }
    public String getRecipeType(){
        return recipeType;
    }
    public void setRecipeType(String recipeType){
        this.recipeType=recipeType;
    }
    public List<String> getIngredients(){
        return ingredients;
    }
    public void setIngredients(List<String> ingredients){
        this.ingredients=ingredients;
    }
    
}