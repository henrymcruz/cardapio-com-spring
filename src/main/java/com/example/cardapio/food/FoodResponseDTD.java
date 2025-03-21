package com.example.cardapio.food;

public record FoodResponseDTD(Long id, String title, String image, Integer price) {

    public FoodResponseDTD(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
