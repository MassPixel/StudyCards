package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

@Entity
@SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
public class Category {

    @PrimaryKey(autoGenerate = true)
    public int categoryID;

    @ColumnInfo
    public String CategoryName;

    @ColumnInfo
    public  String CategoryDescription;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}
