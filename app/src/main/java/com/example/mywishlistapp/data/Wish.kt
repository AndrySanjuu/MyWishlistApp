package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)


object DummyWish{
    val whishList = listOf(
        Wish(title = "test",
            description = "bla bla bla"),
        Wish(title = "test 1",
            description = "bla bla bla"),
        Wish(title = "test 2",
            description = "bla bla bla"),

    )
}