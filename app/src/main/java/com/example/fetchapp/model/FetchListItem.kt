package com.example.fetchapp.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FetchListItem(
    @PrimaryKey val id: Int,
    @NonNull val listId: Int,
    @NonNull val name: String
)