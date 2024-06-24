package com.perpus.visipustaka.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.perpus.visipustaka.database.dao.DatabaseDao_Impl;
import com.perpus.visipustaka.database.dao.DatabaseDao;


//untuk entitas model database
@Database(entities = {DatabaseModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
