package com.example.mini5

data class ShoppingItem(
    val id: Int,
    val name: String,
    val quantity: Int,
    val isBought: Boolean = false
)
