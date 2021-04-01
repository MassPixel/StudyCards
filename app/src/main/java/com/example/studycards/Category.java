package com.example.studycards;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Category")
public class Category {
    @PrimaryKey
    @NonNull
    public int CategoryID;

    @ColumnInfo
    @NonNull
    public String CategoryName;

    @ColumnInfo
    public  String CategoryDescription;
}
