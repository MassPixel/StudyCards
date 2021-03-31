package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Category {
    @PrimaryKey
    public int CategoryID;

    @ColumnInfo
    public String CategoryName;

    @ColumnInfo
    public  String CategoryDescription;
}
