package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

@Entity(tableName = "Category")
@SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
public class Category {
    @PrimaryKey
    public int CategoryID;

    @ColumnInfo
    public String CategoryName;

    @ColumnInfo
    public  String CategoryDescription;
}
