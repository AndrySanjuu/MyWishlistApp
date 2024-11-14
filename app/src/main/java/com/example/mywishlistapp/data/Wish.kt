package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
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